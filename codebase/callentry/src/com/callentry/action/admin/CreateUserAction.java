package com.callentry.action.admin;

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
		String result = "success";
		try {
			UserService.saveOrUpdate(user);
			System.out.println(user);
		} catch (Exception e) {
			result = "failure";
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public void validate() {
		if (user != null
				&& UserService.getByUserName(user.getUserName()) != null) {
			userTypes = CommonUtil.getUserTypes();
			addFieldError("user.userName", "user already exist");
		}

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
