//Line 4 imports java utilities library so that arrays can be used

package assignment;
import java.util.*;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  TO DO LIST:
		//  Specify all the subclasses, so that instead of saying etc: WEAPON STATS, it says LASER WEAPON STATS
		//  Add Display to all subclasses + superclasses, only subclasses need appends though
		//  Fix bug where primary, secondary, defence and shield function do not display correctly
		//  There's a bug where you can search any ship, even if unrecognised, and the program still finds it - add it to testing table
		//  Do work on testing table
		//  Comment all of the code
		//  Minimise repeats
		
		//  FOR TESTSHIP 1
		Engine Speeder_Mk1 = new Voyager_Engine("Speeder Mk1", "Hydrogen", 100.0, 10.0, 50.0); 
		Radar Spy_Mk1 = new Radar("Spy Mk1", 100.0, 5.0, 20);
		Hull Kalvers_50mm = new Hull("Kalvers 50mm", "Titanium Alloy", 250.0, 50, 450.0, 5.5);
		Weapon Suppressor_1 = new Plasma("Suppressor 1", 10.0, 1200.0, 65.0, 0.025, 60.0, 9500.0, 10.0, 0.0, 0.0, 0.0);
		Weapon Plow_Missile_1 = new Laser("Plow_Missile_1", 50.0, 6.0, 1.0, 10.0, 0.0, 1000.0, 0.0, 0.0, 0.0, 0.0, 0.0);
		Shield Protector = new Shield("Protector 1", 1.0, 100.0, 5.0);
		Defence Guardian_1 = new AimDownSights("Guardian Mk1", 5.0, 50.0, 11.0, 95.0, 3.0, 500.0);
		
		Fighter testShip = new Fighter("Test Ship", 100.0, Speeder_Mk1, Spy_Mk1, Kalvers_50mm, Suppressor_1, Plow_Missile_1, Guardian_1, Protector);
		
		//Printing information about testShip
		System.out.println(testShip.display());
		
		//Printing information about testShip2
		//System.out.println(testShip2.display());
		
		ArrayList<Ship_Superclass> ships = new ArrayList<Ship_Superclass>();
		//ships.add(testShip);       Not needed for the search to work
		Scanner scan = new Scanner(System.in);
		String shipSearch = scan.nextLine();
		System.out.println("SHIP FOUND: \n" + shipSearch);
		scan.close();
		for (Ship_Superclass s: ships) {
			s.display();
			break;
		}
		scan.close();
	}

}
