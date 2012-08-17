package com.callentry.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.callentry.model.User;
import com.callentry.service.UserService;
import com.callentry.util.IConstants;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware {

	private User user;
	private Map<String, Object> session = null;

	public String execute() {
		String result = "failure";
		User loggedInUser = UserService.getByUserName(user.getUserName());
		// System.out.println(loggedInUser);
		if (loggedInUser != null) {
			HttpSession httpSession = ServletActionContext.getRequest()
					.getSession(true);
			httpSession.setAttribute("loggedin", true);
			httpSession.setAttribute("user", loggedInUser);
			// session.put("loggedin", true);
			// session.put("user", loggedInUser);
			if (loggedInUser.getUserType() == IConstants.ADMIN_USER) {
				result = "admin";
			} else if (loggedInUser.getUserType() == IConstants.USER) {
				result = "user";
			}
		} else {
			User admin = UserService.getByUserName("admin");
			if (admin == null) {
				admin = new User("admin", "admin", "Call Entry", "admin", 2);
				UserService.saveOrUpdate(admin);
			}
		}

		return result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
