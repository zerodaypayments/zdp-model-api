package io.zdp.api.model;

public interface TxErrors {

	public static final byte NO_ERROR = 0;

	public static final byte ERROR_FROM_ACCOUNT_NOT_ACTIVE = 1;
	public static final byte ERROR_TO_ACCOUNT_NOT_ACTIVE = 2;
	public static final byte ERROR_WRONG_AMOUNT = 3;
	public static final byte ERROR_INSUFFICIENT_FUNDS = 4;

	public static final byte ERROR_SYSTEM_ERROR = 5;

}
