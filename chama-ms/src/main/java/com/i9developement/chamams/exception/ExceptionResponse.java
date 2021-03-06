package com.i9developement.chamams.exception;

import java.io.Serializable;
import java.util.Date;

class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1327255242505348589L;

	private Date timeStamp;
	private String message;
	private String details;

	public ExceptionResponse() {
		
	}

	public ExceptionResponse(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [timeStamp=" + timeStamp + ", message=" + message + ", details=" + details + "]";
	}
	
	

}
