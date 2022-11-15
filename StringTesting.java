package com.program.java;
import java.util.Scanner;

public class StringTesting {
	
	public static void name() { //static method
		
		Scanner sn = new Scanner(System.in);
		System.out.println("please enter your first name : " );
		String FirstName = sn.nextLine();
		System.out.println("please enter your last name : ");
		String LastName = sn.nextLine();
		
		String StudentName = (FirstName.concat(LastName) );
		System.out.println("your name is : " + StudentName);
		System.out.println("for conforming are you enter your name or not (is name coloum empty) : " + StudentName.isEmpty());
		System.out.println("for conforming your first and last name are same ? : " + FirstName.contentEquals(LastName));
		System.out.println("length of your name is  : " + StudentName.length());
		System.out.println("first letter of your name is : " + StudentName.charAt(0));
		System.out.println("your firt name : " + StudentName.substring(0, 6));
		System.out.println("your last name : " + StudentName.substring(6));
	   
	   }
	
	public static void detail() {
		
		String email = new String ("    SURESH.RAMAMOORTHY@GMAIL.COM");
		System.out.println("we create default email id as per your name : " + email);
		
		Scanner snn = new Scanner(System.in);
		System.out.println("enter your mail id what you to like : " );
		String emailid = snn.nextLine();
		
		System.out.println("your email id is : " + emailid);
		System.out.println("print default email id whithout whitespace : " + email.trim());
		System.out.println("show your default emailid as lower case : " + email.toLowerCase());
		System.out.println("show your emailid you created as upper case : " + email.toUpperCase());
		System.out.println("position of '@' from right to left in  your default emailid : " + email.indexOf("@"));
		System.out.println("position of '@' from left to right in your email is : " + emailid.lastIndexOf("@"));
		System.out.println("your email id and default email id are same ? : " + email.equalsIgnoreCase(emailid));
		System.out.println("change your default email to orginal email : " + email.replaceAll(email, emailid));
		
	}
	
	public static void detail1() {
		
		Scanner sns = new Scanner(System.in);
		System.out.println("enter your university name : ");
		String UniversityName = sns.nextLine();
		System.out.println("your college name : " + UniversityName);
		System.out.println("enter your college name : ");
		String CollegeName = sns.nextLine();
		
		System.out.println("your college name : " + CollegeName);
		System.out.println("your university and college name are same ? : " + UniversityName.equals(CollegeName));
		System.out.println("your university belongs to anna university : "  + UniversityName.contains("anna university"));
		System.out.println("your university belongs to madras university : " + UniversityName.startsWith("madras"));
		System.out.println("university name must end with name 'university' : " + UniversityName.endsWith("university"));
		
	}
	
	public static void detail2() {
		
		Scanner snn = new Scanner(System.in);
		System.out.println("enter your programme : ");
		String programme = snn.nextLine();
		System.out.println("your programme is : " + programme);
		System.out.println("enter your department : ");
		String department = snn.nextLine();
		System.out.println("your department is : " + department);
		
		System.out.println("your programee and department both are same : "  + programme.equals(department));
		System.out.println("does your department belongs to mechanical engineering :  " + department.matches("mechanical engineering"));
		System.out.println("does your department belongs to computing science : " + department.matches("computer science and engineering"));
		System.out.println("hashcode : " + programme.hashCode());
		System.out.println("code point at : " + programme.codePointAt(0));		 
		
	}
	
	public static void main(String args[]) { //main method
		
		StringTesting.name();
		StringTesting.detail();
		StringTesting.detail1();
		StringTesting.detail2();
	
	}

}
