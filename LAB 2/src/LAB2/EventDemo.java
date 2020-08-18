package LAB2;

import java.util.Scanner;




public class EventDemo {
	public static void main(String[] args)
	{
		
		displayCost();
    }

public static void displayCost()
{
    int guests;
    int totalBill;
    String EventNumber;
    boolean isLargeEvent;
    String numberOfGuests;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please Insert Here , How many Guest will be attending the party: ");
    numberOfGuests = input.nextLine();
    guests = Integer.parseInt(numberOfGuests);
    System.out.println("Enter The Event Number");
	EventNumber = input.nextLine();
    
    
	
    
  
  
    totalBill = guests * 35;
    

    if (guests >= 49)
    {
  	  isLargeEvent = true;
    }
    
    else
    {
  	  isLargeEvent = false;
    }
    
    System.out.println("Number Of Guests: " + numberOfGuests +
    		           "\nPrice Per Guest: 35" +
    		           "\nEvent Number is: " + EventNumber +
    		           "\nTotal price: $" + totalBill +
                       "\nIs this a Large Event? " + isLargeEvent);
		


}

	}


