package io.zdp.model.network;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.zdp.crypto.Base58;
import io.zdp.crypto.Curves;
import io.zdp.crypto.Keys;
import io.zdp.crypto.key.ZDPKeyPair;

/**
 * Validation nodes
 *
 */
@SuppressWarnings("serial")
public class NetworkNode implements Serializable {

	private static final Logger log = LoggerFactory.getLogger(NetworkNode.class);

	private String hostname;

	private int httpPort;

	private String amqHostname;

	private int amqPort;

	private String uuid;

	private String publicKey;

	private String privateKey;

	private PublicKey pub;

	private PrivateKey priv;

	private NetworkNodeType nodeType;

	public String getAmqHostname() {
		return amqHostname;
	}

	public void setAmqHostname(String amqHostname) {
		this.amqHostname = amqHostname;
	}

	public int getAmqPort() {
		return amqPort;
	}

	public void setAmqPort(int amqPort) {
		this.amqPort = amqPort;
	}

	public String getHttpEndpointUrl() {
		return null;
	}

	public PrivateKey getECPrivateKey() {
		return priv;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {

		this.privateKey = privateKey;

		ZDPKeyPair kp = ZDPKeyPair.createFromPrivateKeyBase58(privateKey, Curves.VALIDATION_NODE_CURVE);

		this.priv = kp.getPrivateKeyAsPrivateKey();
		this.publicKey = kp.getPublicKeyAsBase58();
		this.pub = kp.getPublicKeyAsPublicKey();
	}

	public NetworkNodeType getNodeType() {
		return nodeType;
	}

	public void setNodeType(NetworkNodeType nodeType) {
		this.nodeType = nodeType;
	}

	public PublicKey getECPublicKey() {
		return pub;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {

		this.publicKey = publicKey;

		try {
			this.pub = Keys.toPublicKey(Base58.decode(publicKey), Curves.VALIDATION_NODE_CURVE);
		} catch (Exception e) {
			log.error("Error: ", e);
		}
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getHttpPort() {
		return httpPort;
	}

	public void setHttpPort(int httpPort) {
		this.httpPort = httpPort;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "NetworkNode [hostname=" + hostname + ", httpPort=" + httpPort + ", amqHostname=" + amqHostname + ", amqPort=" + amqPort + ", uuid=" + uuid + ", publicKey=" + publicKey + ", privateKey=" + privateKey + ", nodeType=" + nodeType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amqHostname == null) ? 0 : amqHostname.hashCode());
		result = prime * result + amqPort;
		result = prime * result + ((hostname == null) ? 0 : hostname.hashCode());
		result = prime * result + httpPort;
		result = prime * result + ((nodeType == null) ? 0 : nodeType.hashCode());
		result = prime * result + ((privateKey == null) ? 0 : privateKey.hashCode());
		result = prime * result + ((publicKey == null) ? 0 : publicKey.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NetworkNode other = (NetworkNode) obj;
		if (amqHostname == null) {
			if (other.amqHostname != null)
				return false;
		} else if (!amqHostname.equals(other.amqHostname))
			return false;
		if (amqPort != other.amqPort)
			return false;
		if (hostname == null) {
			if (other.hostname != null)
				return false;
		} else if (!hostname.equals(other.hostname))
			return false;
		if (httpPort != other.httpPort)
			return false;
		if (nodeType != other.nodeType)
			return false;
		if (privateKey == null) {
			if (other.privateKey != null)
				return false;
		} else if (!privateKey.equals(other.privateKey))
			return false;
		if (publicKey == null) {
			if (other.publicKey != null)
				return false;
		} else if (!publicKey.equals(other.publicKey))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	public String getHttpBaseUrl() {
		return "http://" + hostname + ":" + httpPort;
	}

	public boolean isValidating() {
		return NetworkNodeType.VALIDATING.equals(nodeType);
	}

}
