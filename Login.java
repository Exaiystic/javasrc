package assignment;

import java.util.Scanner;

public class Login {
	//Declaring the username and password vars
	String username;
	String password;
	String keyword;
	private String inputUsername;
	private String inputPassword;
	private int verifyResponse;
	
	//Prompting the user to input the login credentials
	//Additionally, we want it to be void because we do not want to return a value
    public void getLoginCredentials(String username, String password) {       	
    	this.username = username;
    	this.password = password;
    	
    	System.out.println(username);
    	System.out.println(password);
    	
		System.out.println("Please log in");
		System.out.println("Username:");
		Scanner loginCredentials = new Scanner(System.in);
		inputUsername = loginCredentials.nextLine();
		System.out.println("Password:");
		inputPassword = loginCredentials.nextLine();
		
		verifyCredentials(inputUsername, username, inputPassword, password);
	}
    
    public void verifyCredentials(String inputUsername, String username, String inputPassword, String password) {
    	if (inputUsername.equals(username)) {
    		if (inputPassword.equals(password)) {
        		System.out.println("Password Correct");
        		System.out.println("Login Successful");
    		} else {
        		System.out.println("Username Incorrect");
        		System.out.println("Login Failed");
        		getLoginCredentials(username, password);
    		}
    	} else {
    		System.out.println("Username Incorrect");
    		System.out.println("Login Failed");
    		getLoginCredentials(username, password);
    	}
    }
    
    public void loginSuccess() {
    	System.out.println("Login Successful");
    }
    
    public void loginFailure() {
    	System.out.println("Login Failed");
    }
}