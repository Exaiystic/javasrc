package assignment;

import java.util.Scanner;

public class Login {
	//Declaring the username and password vars
	//Username and Password
	String username;
	String password;
	
	//The Username and Password that the user inputs
	private String inputUsername;
	private String inputPassword;
	
	//Method used to get the user inputs
	//We want it to be void because we do not want to return a value
    public void getLoginCredentials(String username, String password) {       	
    	//Constructors, we use these two say that the following vars are equal to the ones outside of the method
    	this.username = username;
    	this.password = password;
    	
    	//Creating a scanner that can be used to get user inputs
    	Scanner loginCredentials = new Scanner(System.in);
    	
    	//Prompting the user for a username
		System.out.println("Please log in");
		System.out.println("Username:");
		
		//Getting the user input and storing it in the 'inputUsername' var
		inputUsername = loginCredentials.nextLine();
		
		//Prompting the user for a password
		System.out.println("Password:");
		
		//Getting the user input and storing it in the 'inputPassword' var
		inputPassword = loginCredentials.nextLine();
		
		//Calling the method used to verify the inputs
		verifyCredentials(inputUsername, username, inputPassword, password);
	}
    
    //Method used to verify the user inputs
    public void verifyCredentials(String inputUsername, String username, String inputPassword, String password) {
    	  
    	//If the username inputted is equal to the true username...
    	if (inputUsername.equals(username)) {
    		
    		//If the username and password are both correct...
    		if (inputPassword.equals(password)) {
    			
    			//Tell the user that they are correct and end the method
    			//Ending the method will allow them to progress onto searching for a ship
        		System.out.println("Password Correct");
        		System.out.println("Login Successful");
        		
        	//If the username is correct but not the password...	
    		} else {
    			
    			//Tell the user that the password is incorrect
    			//Forces the user to enter the username and password again
        		System.out.println("Password Incorrect");
        		System.out.println("Login Failed");
        		getLoginCredentials(username, password);
    		}
    		
    	//If the username is incorrect...
    	} else {
    		
    		//Tell the user that the username is incorrect
    		//Forces the user to enter the username and password again
    		System.out.println("Username Incorrect");
    		System.out.println("Login Failed");
    		getLoginCredentials(username, password);
    	}
    }
}