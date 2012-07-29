package com.callentry.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.callentry.model.CallEntry;
import com.callentry.model.User;
import com.callentry.service.CallEntryService;
import com.callentry.service.UserService;
import com.callentry.util.CommonUtil;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CallEntryAction extends ActionSupport implements SessionAware {

	private CallEntry callEntry;
	private Map<String, Object> session;
	private Map<Integer, String> callTypes;

	public String populate() {
		callTypes = CommonUtil.getCallTypes();
		return "populated";
	}

	public String execute() {
		String result = "success";
		try {
			User user = (User)session.get("user");
			callEntry.setUserId(user.getUserId());
			CallEntryService.saveOrUpdate(callEntry);
			System.out.println(callEntry);
		} catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}

		return result;
	}

	public Map<Integer, String> getCallTypes() {
		return callTypes;
	}

	public void setCallTypes(Map<Integer, String> callTypes) {
		this.callTypes = callTypes;
	}

	public CallEntry getCallEntry() {
		return callEntry;
	}

	public void setCallEntry(CallEntry callEntry) {
		this.callEntry = callEntry;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
