package com.callentry.util;

import java.util.HashMap;
import java.util.Map;

public class CommonUtil implements IConstants {

	public static Map<Integer, String> getUserTypes() {
		Map<Integer, String>  userTypes = new HashMap<Integer, String>();
		userTypes.put(USER, "User");
		userTypes.put(ADMIN_USER, "Admin User");
		return userTypes;
	}

}
