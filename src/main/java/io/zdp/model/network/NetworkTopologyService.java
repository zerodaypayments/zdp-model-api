package io.zdp.model.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.zdp.crypto.Signing;

public class NetworkTopologyService {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	private List<NetworkNode> nodes;

	private String vnlFileContent;

	 private String vnlUrl = "https://zdp.s3.amazonaws.com/vnl.json";
//	private String vnlUrl = "http://localhost:8081/vnl.json";

	private Set<NetworkTopologyListener> changeListeners = new HashSet<>();

	public void init() {

		log.debug("Refreshing network configuration: " + vnlUrl);

		try {
			// Download public VNL (List of Validation Nodes) file
			final URL url = new URL(vnlUrl);

			final ObjectMapper jsonMapper = new ObjectMapper();
			jsonMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

			try (InputStream in = url.openStream()) {
				vnlFileContent = IOUtils.toString(in, StandardCharsets.UTF_8);
			} catch (Exception e) {
				log.error("Can't get VNL file: " + vnlUrl);
				return;
			}

			final List<NetworkNode> topology = jsonMapper.readValue(vnlFileContent, new TypeReference<List<NetworkNode>>() {
			});

			for (NetworkNode node : topology) {
				node.setNodeType(NetworkNodeType.VALIDATING);
			}

			if (nodes == null || false == CollectionUtils.isEqualCollection(topology, nodes)) {

				log.debug("VNL: " + vnlFileContent);

				nodes = new ArrayList<>(topology);

				log.debug("Loaded/reloaded list of validation nodes: " + nodes);

				// Notify topology change listeners
				for (NetworkTopologyListener l : changeListeners) {
					l.onChange();
				}

			} else {
				log.debug("No change in network topology");
			}

		} catch (IOException ioe) {
			log.error("Can't load VNL file: ", ioe);
			System.out.println("Can't load VNL file: " + ioe.getMessage());
		} catch (Exception e) {
			log.error("Error: ", e);
		}

	}

	public void addChangeListener(NetworkTopologyListener listener) {
		this.changeListeners.add(listener);
	}

	public List<NetworkNode> getAllBut(NetworkNode node) {

		List<NetworkNode> list = new ArrayList<>(this.getAllNodes());

		if (list != null) {
			list.remove(node);
		}

		return list;

	}

	public List<NetworkNode> getAllNodes() {

		if (nodes == null) {
			init();
		}

		if (nodes == null) {
			return Collections.emptyList();
		}

		return nodes;

	}

	public NetworkNode getNodeByUuid(String uuid) {
		for (NetworkNode n : getAllNodes()) {
			if (uuid.equals(n.getUuid())) {
				return n;
			}
		}
		return null;
	}

	public boolean isValidServerRequest(String serverUuid, byte[] data, byte[] signature) {

		NetworkNode node = this.getNodeByUuid(serverUuid);

		if (node != null) {

			try {
				return Signing.isValidSignature(node.getECPublicKey(), data, signature);
			} catch (Exception e) {
				log.error("Error: ", e);
			}
		}

		return false;

	}

	public String getVnlUrl() {
		return vnlUrl;
	}

	public void setVnlUrl(String vnlUrl) {
		this.vnlUrl = vnlUrl;
	}

	public String getVnlFileContent() {
		return vnlFileContent;
	}

	public NetworkNode getRandomNode() {
		return getAllNodes().get(ThreadLocalRandom.current().nextInt(getAllNodes().size()));
	}

}
