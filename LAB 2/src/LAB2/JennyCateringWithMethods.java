package LAB2;

import java.util.Scanner;

public class JennyCateringWithMethods {
	
	public static void main(String[] args)
	{
		displayCost();
	      }
	
	public static void displayCost()
	{
	      int guests;
	      int totalBill;
	      boolean isLargeEvent;
	      String numberOfGuests;
	      
	      Scanner input = new Scanner(System.in);
	      System.out.println("Please Insert Here , How many Guest will be attending the party: ");
	      numberOfGuests = input.nextLine();
	      guests = Integer.parseInt(numberOfGuests);
	      
	    
	      totalBill = guests * 35;
	      

	      if (guests >= 49)
	      {
	    	  isLargeEvent = true;
	      }
	      
	      else
	      {
	    	  isLargeEvent = false;
	      }
	      
	      System.out.println("\nTotal price: $" + totalBill +
	                         "\nIs this a Large Event? " + isLargeEvent);
			


	}
}