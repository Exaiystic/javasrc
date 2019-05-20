//Line 4 imports java utilities library so that arrays can be used

package assignment;
import java.util.*;

public class assignment {

	public static void main(String[] args) {
		//User Login
		Login admin = new Login(); //Create a new login called admin
		admin.getLoginCredentials("admin", "password123"); //We state the credentials in the order of username then password
		
		shipSearch();
		
		retryPrompt();
	}
	
	public static void shipSearch() {
		// TODO Auto-generated method stub
		
		ArrayList<Ship_Superclass> ships = new ArrayList<Ship_Superclass>(); //Array for ship scan - needs to include everything
		
		//  FOR TESTSHIP 1
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
		Scanner shipScan = new Scanner(System.in); //Creating a place for the input to be stores
		String shipSearch = shipScan.nextLine(); //Getting the input and storing it
		
		for (Ship_Superclass s: ships) { //For loop saying "For as long as there are ships in Ship_Superclass
			if (s.getName().equals(shipSearch)) { //If s is equal to searched ship then do the below:
				System.out.println(s.display()); //Display the stats of the ship s
			    System.out.println("Expand? Y/N");
			    Scanner expandScanner = new Scanner(System.in);
			    String expandResponse = expandScanner.nextLine();
			    if (expandResponse.equals("Y") ) {
			        System.out.println(s.displayExpand());
			    }
			} else {
				System.out.println("NO SHIP DETECTED");
			}
		}
	}
	
	public static void retryPrompt() {
		System.out.println("Scan for another ship? Y/N");
		Scanner retryScan = new Scanner(System.in); //Creating a place for the input to be stores
		String retryInput = retryScan.nextLine(); //Getting the input and storing it
		
		if (retryInput.equals("Y")) {
			shipSearch();
		}
	}
}

