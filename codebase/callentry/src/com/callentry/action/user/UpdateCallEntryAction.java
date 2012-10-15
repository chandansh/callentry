package com.callentry.action.user;

import java.util.Map;

import com.callentry.model.CallEntry;
import com.callentry.service.CallEntryService;
import com.callentry.util.CommonUtil;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateCallEntryAction extends ActionSupport {
	private CallEntry callEntry;
	private String entryId;
	private String forwardPage;
	private Map<Integer, String> callTypes;

	public String getForwardPage() {
		return forwardPage;
	}

	public void setForwardPage(String forwardPage) {
		this.forwardPage = forwardPage;
	}

	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	public String deleteEntry() {
		// String entryId = ServletActionContext.getRequest().getParameter(
		// "entryId");
		// System.out.println("entryId :" + entryId);
		// System.out.println("forwardPage :" + forwardPage);
		CallEntryService.removeEntry(entryId);

		return forwardPage;
	}

	public String populate() {
		callEntry = CallEntryService.get(entryId);
		// System.out.println("callEntry populate :"+ callEntry);
		callTypes = CommonUtil.getCallTypes();
		return "populated";
	}

	public String update() {
		// String entryId = ServletActionContext.getRequest().getParameter(
		// "entryId");
		// System.out.println("entryId :" + entryId);
		// System.out.println("forwardPage :" + forwardPage);
		// System.out.println("callEntry :" + callEntry);
		CallEntry newCallEntry = CallEntryService.get(callEntry.getId());
		newCallEntry.setUserId(callEntry.getUserId());
		newCallEntry.setCallType(callEntry.getCallType());
		newCallEntry.setName(callEntry.getName());
		newCallEntry.setServiceTicketNo(callEntry.getServiceTicketNo());
		newCallEntry.setOnlineDiscription(callEntry.getOnlineDiscription());
		newCallEntry.setSaleMade(callEntry.isSaleMade());
		newCallEntry.setAmount(callEntry.getAmount());
		newCallEntry.setAgreementOrderNo(callEntry.getAgreementOrderNo());
		newCallEntry.setComments(callEntry.getComments());
		CallEntryService.saveOrUpdate(newCallEntry);

		return forwardPage;
	}

	public CallEntry getCallEntry() {
		return callEntry;
	}

	public void setCallEntry(CallEntry callEntry) {
		this.callEntry = callEntry;
	}

	public Map<Integer, String> getCallTypes() {
		return callTypes;
	}

	public void setCallTypes(Map<Integer, String> callTypes) {
		this.callTypes = callTypes;
	}

}
