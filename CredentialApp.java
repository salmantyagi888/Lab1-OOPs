package com.email.model;
import java.util.Scanner;
import com.email.model.Employee;
import com.email.service.CredentialService;

public class CredentialApp {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Salman","Tyagi");
        CredentialService credentialservice =new CredentialService();
        String generatedEmail = "";
        char[] generatedPwd;
		
        System.out.println("Please Enter The Department Following : ");
		        
		        System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");
	
	Scanner Scanner = new Scanner(System.in);
	int option = Scanner.nextInt();
	
	CredentialService credentialService = new CredentialService();
	if(option==1) {
		 generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastname(),"tech");
			
	} else if(option==2){
		 generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastname(),"adm");
		
	}
	else if(option==3) {
		 generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastname(),"hr");
		
	}else if(option==4) {
		 generatedEmail=credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastname(),"lg");
		
	}else {
		System.out.println("Please Select Valid Option");
		Scanner.close();
		System.exit(-1);
	}
	generatedPwd=credentialService.generatePassword();	
	credentialService.showCredentials(employee.getFirstName(),generatedEmail,generatedPwd);
	Scanner.close();
	
	}

}
