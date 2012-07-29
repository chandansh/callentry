package com.callentry.action;

import java.util.Map;

import com.callentry.model.User;
import com.callentry.service.UserService;
import com.callentry.util.CommonUtil;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CreateUserAction extends ActionSupport {

	private User user;
	private Map<Integer, String> userTypes;

	public String populate() {
		userTypes = CommonUtil.getUserTypes();
		return "populated";
	}

	public String execute() {
		final String result = "success";
		UserService.saveOrUpdate(user);
		System.out.println(user);
		return result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<Integer, String> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(Map<Integer, String> userTypes) {
		this.userTypes = userTypes;
	}

}
