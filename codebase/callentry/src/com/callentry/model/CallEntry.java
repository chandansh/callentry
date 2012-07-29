package com.callentry.model;

import com.callentry.util.GUIDGenerator;

public class CallEntry {

	private String id;
	private String userId;
	private String serviceTicketNo;
	private String customerName;
	private int typeOfCall;
	private boolean sale;
	private double amount;
	private String discription;

	public CallEntry() {
		id = GUIDGenerator.generateNewId();
	}

	public CallEntry(String userId, String serviceTicketNo,
			String customerName, int typeOfCall, boolean sale, double amount,
			String discription) {
		this();
		this.userId = userId;
		this.serviceTicketNo = serviceTicketNo;
		this.customerName = customerName;
		this.typeOfCall = typeOfCall;
		this.sale = sale;
		this.amount = amount;
		this.discription = discription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getServiceTicketNo() {
		return serviceTicketNo;
	}

	public void setServiceTicketNo(String serviceTicketNo) {
		this.serviceTicketNo = serviceTicketNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTypeOfCall() {
		return typeOfCall;
	}

	public void setTypeOfCall(int typeOfCall) {
		this.typeOfCall = typeOfCall;
	}

	public boolean isSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

}
