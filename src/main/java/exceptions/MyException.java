package exceptions;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 620676343787817836L;

	private String myCustomMessage;

	private HttpErrorCode errorCode;

	public MyException(String errorMessage, HttpErrorCode responseErrorCode, Throwable e) {
		super(e);
		myCustomMessage = errorMessage;
		errorCode = responseErrorCode;
	}

	public enum HttpErrorCode {
		NOT_FOUND, REDIRECT, BAD_REQUEST;
	}

	public String getMyCustomMessage() {
		return myCustomMessage;
	}

	public HttpErrorCode getErrorCode() {
		return errorCode;
	}

}
