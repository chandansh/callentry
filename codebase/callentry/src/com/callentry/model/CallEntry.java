package com.callentry.model;

import java.util.Date;

import com.callentry.util.GUIDGenerator;

public class CallEntry {

	private String id;
	private String userId;
	private String name;
	private Date date;
	private int callType;
	private String serviceTicketNo;
	private String onlineDiscription;
	private boolean saleMade;
	private double amount;
	private String agreementOrderNo;
	private String comments;

	public CallEntry() {
		id = GUIDGenerator.generateNewId();
		date = new Date();
	}

	public CallEntry(String userId, String name, int callType,
			String serviceTicketNo, String onlineDiscription, boolean saleMade,
			double amount, String agreementOrderNo, String comments) {
		this();
		this.userId = userId;
		this.name = name;
		this.callType = callType;
		this.serviceTicketNo = serviceTicketNo;
		this.onlineDiscription = onlineDiscription;
		this.saleMade = saleMade;
		this.amount = amount;
		this.agreementOrderNo = agreementOrderNo;
		this.comments = comments;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCallType() {
		return callType;
	}

	public void setCallType(int callType) {
		this.callType = callType;
	}

	public String getServiceTicketNo() {
		return serviceTicketNo;
	}

	public void setServiceTicketNo(String serviceTicketNo) {
		this.serviceTicketNo = serviceTicketNo;
	}

	public String getOnlineDiscription() {
		return onlineDiscription;
	}

	public void setOnlineDiscription(String onlineDiscription) {
		this.onlineDiscription = onlineDiscription;
	}

	public boolean isSaleMade() {
		return saleMade;
	}

	public void setSaleMade(boolean saleMade) {
		this.saleMade = saleMade;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAgreementOrderNo() {
		return agreementOrderNo;
	}

	public void setAgreementOrderNo(String agreementOrderNo) {
		this.agreementOrderNo = agreementOrderNo;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "id : " + id + " user Id : " + userId + " name:" + name
				+ " date :" + date + " callType :" + callType
				+ " serviceTicketNo:" + serviceTicketNo
				+ " onlineDiscription :" + onlineDiscription + " saleMade:"
				+ saleMade + " amount:" + amount + " agreementOrderNo :"
				+ agreementOrderNo + " comments:" + comments;
	}

}
