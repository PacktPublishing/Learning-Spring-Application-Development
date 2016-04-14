package org.packt.Spring.chapter7.springmvc.exception;

public class GenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String exceptionMsg;
	private String exceptionCode;

	public GenericException(String exceptionCode, String exceptionMsg) {
		this.exceptionCode = exceptionCode;
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
}
