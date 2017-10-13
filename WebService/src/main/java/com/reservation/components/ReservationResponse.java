package com.reservation.components;

public class ReservationResponse {
	
	private String errorMsg;
	private String succesMsg;
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getSuccesMsg() {
		return succesMsg;
	}
	public void setSuccesMsg(String succesMsg) {
		this.succesMsg = succesMsg;
	}
}
