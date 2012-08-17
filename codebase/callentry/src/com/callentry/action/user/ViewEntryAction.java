package com.callentry.action.user;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.callentry.model.CallEntry;
import com.callentry.model.User;
import com.callentry.service.CallEntryService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ViewEntryAction extends ActionSupport {
	private Date date;
	private List<CallEntry> entries = new ArrayList<CallEntry>();

	public String populate() {
		date = new Date();
		return SUCCESS;
	}
	public String listTodayEntries() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		entries = CallEntryService.getByUserAndDate(user.getUserId(),
				Calendar.getInstance());
		return SUCCESS;
	}

	public String listAllEntries() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		entries = CallEntryService.getByUser(user.getUserId());
		return SUCCESS;
	}

	public String listDateEntries() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//System.out.println("date:" + date);
		entries = CallEntryService.getByUserAndDate(user.getUserId(), cal);
		// for (CallEntry entry : entries) {
		// System.out.println("Entry : " + entry);
		// }
		return SUCCESS;
	}

	public List<CallEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CallEntry> entries) {
		this.entries = entries;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
