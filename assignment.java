//Line 4 imports java utilities library so that arrays can be used

package assignment;
import java.util.*;

public class assignment {

	//Main Method
    ////////////////////////////////////////////////////////////////////
	//The main method is used to call other functions
	public static void main(String[] args) { //The main method is called be default
		//User Login
		//First line creates a login object called admin so that we can call the function
		//The second line then calls the object's function with the credentials in order username and password
		Login admin = new Login(); 
		admin.getLoginCredentials("admin", "password123");
		
		//Ship Search
		shipSearch(); //Calls the shipSearch method. It is a static method in this class so it is called like this
		
		retryPrompt(); //Calls the retryPrompt method. It is a static method in this class so it is called like this
	}
	
	//Ship Search Method
	////////////////////////////////////////////////////////////////////
	//The shipSearch function is where an inputted ship is searched for and displayed
	public static void shipSearch() {
		// TODO Auto-generated method stub
		
		ArrayList<Ship_Superclass> ships = new ArrayList<Ship_Superclass>(); //Array for ship scan - needs to include everything
		
		//  FOR TESTSHIP 1
		//Creating all components for Test Ship
		Engine Speeder_Mk1 = new Voyager_Engine("Speeder Mk1", "Hydrogen", 5.0, 10.0, 50.0); 
		Radar Spy_Mk1 = new Radar("Spy Mk1", 100.0, 5.0, 20);
		Hull Kalvers_50mm = new Hull("Kalvers 50mm", "Titanium Alloy", 250.0, 50, 450.0, 5.5);
		Weapon Suppressor_1 = new Plasma("Suppressor 1", 10.0, 1200.0, 65.0, 0.025, 60.0, 9500.0, 10.0, 0.0, 0.0, 0.0);
		Weapon Plow_Missile_1 = new Laser("Plow_Missile_1", 50.0, 6.0, 1.0, 10.0, 0.0, 1000.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		Shield Protector = new Shield("Protector 1", 1.0, 100.0, 5.0);
		Defence Guardian_1 = new AimDownSights("Guardian Mk1", 5.0, 50.0, 11.0, 95.0, 3.0, 500.0);
		
		Fighter testShip = new Fighter("Test Ship", 100.0, Speeder_Mk1, Spy_Mk1, Kalvers_50mm, Suppressor_1, Plow_Missile_1, Guardian_1, Protector);
		ships.add(testShip); //Adds testShip to the ships array
		
		//Ship Scanner
		System.out.println(ships);
		
		System.out.println("Input the name of the ship:"); //Prompting user for ship name
		Scanner shipScan = new Scanner(System.in); //Creating a place for the input to be stored
		String shipSearch = shipScan.nextLine(); //Getting the input and storing it
		
		for (Ship_Superclass s: ships) { //For loop saying "For as long as there are ships in Ship_Superclass
			if (s.getName().equals(shipSearch)) { //If s is equal to searched ship then do the below:
				System.out.println(s.display()); //Display the stats of the ship s
			    System.out.println("Expand? Y/N"); //Prompts the user if they want to expand the info
			    Scanner expandScanner = new Scanner(System.in); //Creating a place for the input to be stored
			    String expandResponse = expandScanner.nextLine(); //Getting the input and storing it
			    if (expandResponse.equals("Y") ) { //If the variable equals "Y"...
			        System.out.println(s.displayExpand()); //Run the displayExpand method in whatever s is
			    }
			} else { //Otherwise...
				System.out.println("NO SHIP DETECTED"); //Say "No Ship Detected"
			}
		}
	}
	
	//Retry Prompt Method
    ////////////////////////////////////////////////////////////////////
	//This method asks the user if they want to find another ship, it also 
	//stores the user's input
	public static void retryPrompt() {
		System.out.println("Scan for another ship? Y/N");
		Scanner retryScan = new Scanner(System.in); //Creating a place for the input to be stores
		String retryInput = retryScan.nextLine(); //Getting the input and storing it
	    retryVerification(retryInput); //Call 
	}
   
	public static void retryVerification(String retryInput) {
		if (retryInput.equals("Y")) {
			shipSearch();
		} else if (retryInput.equals("N")) {
			System.out.println("You have been logged out");
		} else {
			System.out.println("Please enter a either Y or N");
			retryPrompt();
		}
	}
}

