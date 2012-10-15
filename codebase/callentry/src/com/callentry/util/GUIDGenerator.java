package com.callentry.util;

import java.util.Random;

public class GUIDGenerator {

	private static final String digits = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String generateNewId() {
		Random random = new Random();
		int size = digits.length() - 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 32; i++) {
			int idx = random.nextInt(size);
			sb.append(digits.charAt(idx));
		}
		return sb.toString();
	}
}
