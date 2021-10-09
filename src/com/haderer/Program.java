package com.haderer;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		boolean stop = false;
		Email email = new Email();
		Scanner scanner = new Scanner(System.in);

		email.addEmail("whaderer@gmx.net");
		email.addEmail("mary@gmail.com");
		email.addEmail("freddy@yahoo.com");
		email.addEmail("paula@hotmail.com");
		email.addEmail("andrew@gmail.com");
		email.addEmail("johnDoe@mail.com");
		email.addEmail("kevin@gmx.net");
		email.addEmail("sebastian@mobil.de");
		email.addEmail("mattsimmons@yahoo.com");
		email.addEmail("mathewmiller@gmail.com");

		while (!stop) {
			System.out.println("Enter your email ort type end");
			String input = scanner.nextLine().toLowerCase();
			if (input.toLowerCase().equals("end")) {
				stop = true;
				scanner.close();
			} else {
				email.findEmailId(input);
				email.printMsg();
			}
		}
	}
}
