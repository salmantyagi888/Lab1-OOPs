package com.email.service;
import java.util.Arrays;
import java.util.Random;

public class CredentialService {
 
	public char[] generatePassword() {
		
		String Numbers ="0123456789";
		String CapitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters="abcdefghijklmnopqrstuvwxyz";
		String SpecialCharectors="%$#@!^&*()_+";
		
		String values = CapitalLetters+SmallLetters+Numbers+SpecialCharectors;
		
		Random random=new Random();
		
		char [] password= new char[8];
		
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	 }
	
    public String generateEmailAddress(String firstname, String lastname, String departmet, String department) {
	return firstname+lastname+"@"+department+".xycompany.com";
	 }
    public void showCredentials(String firstName,String email,char[] pwd) {
	
     System.out.println("Dear "+firstName+"your generated credentials are as follows");
	 System.out.println("Email------>"+email);
	 System.out.println("Password------>"+Arrays.toString(pwd));
	 
 }

	public String generateEmailAddress(String firstName, String lastname, String string) {
	
		return null;
	}
}

