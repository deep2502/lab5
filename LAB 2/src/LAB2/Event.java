package LAB2;

import java.util.Scanner;

public class Event{
	private String Event_Number;
	private int no_guests;
	private int price;
	public void setEventNumber(String event_Number)
	{
		Event_Number = event_Number;
		
	}
	public void setGuests(int no_guests)
	{
		this.no_guests = no_guests;
		
	}
	public String getEventNumber() {
		return Event_Number;
	}
	public int getGuests() {
		return no_guests;
	}
	public int getPrice() {
		return price;
	}
	public static void main(String[] args)
	{
	
	      
		  final int PricePerGuest=35;
	      int totalBill;
	      
	     
	    
	      totalBill = 50 * PricePerGuest;
	      

	      
	      
	      System.out.println("Numer Of Guests: 50" + 
	                         "\nEvent No: M132" +
	    		             "\nPrice Per Guests: $" + PricePerGuest +
	      		             "\nTotal price: $" + totalBill);
			


	}


}
