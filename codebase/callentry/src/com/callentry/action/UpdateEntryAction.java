package com.callentry.action;

import org.apache.struts2.ServletActionContext;

import com.callentry.service.CallEntryService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateEntryAction extends ActionSupport {
	private String entryId;
	private String forwardPage;

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
		System.out.println("entryId :" + entryId);
		System.out.println("forwardPage :" + forwardPage);
		CallEntryService.removeEntry(entryId);
		
		return forwardPage;
	}

}
