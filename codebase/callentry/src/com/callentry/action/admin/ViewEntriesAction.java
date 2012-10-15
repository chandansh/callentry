package com.callentry.action.admin;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.callentry.model.CallEntry;
import com.callentry.model.User;
import com.callentry.service.CallEntryService;
import com.callentry.service.UserService;
import com.callentry.util.CommonUtil;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ViewEntriesAction extends ActionSupport {
	private Date date;
	private String userId;
	private String fileName;
	private Map<String, String> usersForSelectBox;
	private List<CallEntry> entries = new ArrayList<CallEntry>();
	private ByteArrayInputStream excelStream;

	public String populate() {
		date = new Date();
		usersForSelectBox = CommonUtil.getUsersForSelectBox();
		return "populated";
	}

	public String execute() {
		// System.out.println("UserId :"+ userId);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		entries = CallEntryService.getByUserAndDate(userId, cal);
		populate();
		return SUCCESS;
	}

	public String downloadEntries() {
		// System.out.println("UserId :"+ userId);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		entries = CallEntryService.getByUserAndDate(userId, cal);
		StringBuffer data = new StringBuffer();
		data.append("Name\tCall Type\tServiceTicket no\tOnline Description\tSale Made\tAmount\tAgreement Order No\tComments\tDate\n");
		for (CallEntry entry : entries) {
			data.append(entry.getName() + "\t" + entry.getCallType() + "\t"
					+ entry.getServiceTicketNo() + "\t"
					+ entry.getOnlineDiscription() + "\t" + entry.isSaleMade()
					+ "\t" + entry.getAmount() + "\t"
					+ entry.getAgreementOrderNo() + "\t" + entry.getComments()
					+ "\t" + entry.getDate().getTime() + "\n");
		}
		excelStream = new ByteArrayInputStream(data.toString().getBytes());
		User user = UserService.getUser(userId);
		fileName = user.getUserName() + "_" + date + ".xls";
		populate();
		return SUCCESS;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, String> getUsersForSelectBox() {
		return usersForSelectBox;
	}

	public void setUsersForSelectBox(Map<String, String> usersForSelectBox) {
		this.usersForSelectBox = usersForSelectBox;
	}

	public List<CallEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CallEntry> entries) {
		this.entries = entries;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public ByteArrayInputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(ByteArrayInputStream excelStream) {
		this.excelStream = excelStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
