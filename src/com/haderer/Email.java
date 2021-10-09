package com.haderer;

import java.util.ArrayList;

public class Email {

	private ArrayList<String> emails = new ArrayList<>();
	private String match;

	public void addEmail(String emailId) {
		this.emails.add(emailId);
	}

	public void findEmailId(String emailId) {
		for (String str : emails) {
			if (str.toLowerCase().contains(emailId)) {
				this.match = str;
				break;
			}
		}
	}

	public void printMsg() {
		if (this.match == null) {
			System.err.println("No email found");
		} else {
			System.out.print("Match found: " + this.match + "\n");
		}
	}
}
