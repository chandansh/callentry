package com.callentry.action.admin;

import java.util.List;

import com.callentry.model.User;
import com.callentry.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ViewUsersAction extends ActionSupport {
	private List<User> users;

	public String execute() {
		users = UserService.getAll();
		return SUCCESS;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
