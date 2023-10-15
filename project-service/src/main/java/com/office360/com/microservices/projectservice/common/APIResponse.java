package com.office360.com.microservices.projectservice.common;



public class APIResponse {
	private Integer statuscode;
	private String status;
	private Object data;
	private ErrorObj error;
	private String message;
	private String msgCode;
	
	
	
	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public APIResponse(Integer statuscode, String status, Object data, ErrorObj error, String message, String msgCode) {
		super();
		this.statuscode = statuscode;
		this.status = status;
		this.data = data;
		this.error = error;
		this.message = message;
		this.msgCode = msgCode;
	}
	public Integer getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ErrorObj getError() {
		return error;
	}
	public void setError(ErrorObj error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	
	

}
