package emails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		String regex ="^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(email);
		return m.matches();
	}

	public static void main(String[] args) throws InterruptedException {
		List<String>emails=new ArrayList<String>();
		emails.add("madhu@gmail.com");
		emails.add("harikumar@email.com");
		emails.add("chandu@gmail.com");
		emails.add("hi..hello@example.com");
		emails.add("abcd.efgh.com");
		emails.add("@.gmail.com");
		for(String value:emails) {
			System.out.println("Email address "+value+" is "+(isValidEmail(value)?"valid":"invalid"));
		}
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Email Address to Check :");
		String input=sc.nextLine();
		System.out.print("Validating.");
		for(int i=0;i<6;i++) {
			System.out.print(".");
			Thread.sleep(500);
		}
		System.out.println(".");
		
		System.out.println("The email address "+input+" is "+(isValidEmail(input)?"valid":"invalid"));
		}

	}

}
