package com.callentry.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session = null;

	public String execute() {
		System.out.println("logout action invoked..");
		session.remove("loggedin");
		session.remove("user");
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
