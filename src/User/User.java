package User;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import Marriage.Marriage;
import Birthday.Birthday;

public class User {
	public int totalCost;
	private Marriage marriage;
	private Birthday birthday;
	
	public void event() {
		
		boolean eventIteration = true;
		
		
		while(eventIteration) {
			System.out.println("\nEnter the type of Event");
			System.out.println("1. Marriage");
			System.out.println("2. Birthday");
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			
			switch(choice) {
				case 1:
					marriage = new Marriage();
					marriage.venueSelection();
					marriage.photographerSelection();
					marriage.CateringMarriageSelection();
					marriage.peopleCount();
					System.out.println("\nWould you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj2 = new Scanner(System.in);
					int choice2 = obj.nextInt();
					
					if(choice2 == 1) {
						eventIteration = true;
					}
					else {
						System.out.println("\nThanks for using our services. Have a great day!!!");
						System.out.println("The overall cost of your order is " + marriage.overallCost());
						eventIteration = false;
					}
					break;
				case 2:
					birthday = new Birthday();
					birthday.venueSelection();
					birthday.photographerSelection();
					birthday.cateringBirthdaySelection();
					birthday.peopleCount();
					System.out.println("\nWould you like to order more pizzas");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					Scanner obj3 = new Scanner(System.in);
					int choice3 = obj.nextInt();
					
					if(choice3 == 1) {
						eventIteration = true;
					}
					else {
						System.out.println("\nThanks for using our services. Have a great day!!!");
						System.out.println("The overall cost of your order is " + birthday.overallCost());
						eventIteration = false;						
					}
					break;
			}
		}		
	}

}
