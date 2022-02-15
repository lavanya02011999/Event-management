package Admin;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import EventDetailes.Events;
import Welcome.Welcome;
import Admin.Admin;
import Marriage.Marriage;
import Birthday.Birthday;
import Event.Event;
import User.User;

public class Admin {
	
	public void adminPanel() throws IOException {
		System.out.println("\n");
		System.out.println("1. View Event Detailes");
		System.out.println("2. Change Venue detailes");
		System.out.println("3. Change Photographer");
		System.out.println("4. Change the Caterer");
		System.out.println("5. Back");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			viewVenueAndPrice();
			break;
		case 2:
			venuePriceChange();
			break;	
		case 3:
			venueAddition();
			break;
		case 4:
			venueDeletion();
			break;
		case 5:
			Welcome welcome = new Welcome();
			welcome.HomeScreen();
			break;
		}		
	}
	

	public void venuePriceChange() throws IOException {
		System.out.println("\nSelect the Venue");
		System.out.println("1. Venue");
		System.out.println("2. photographer");
		System.out.println("3. Catering marriage");
		System.out.println("4. Catering birthday");
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String venueKey = "";
			int newvenueCost = 0;
			
			Events.printvenue();
			
			System.out.println("\nEnter the venue for which the price should be modified: ");
			venueKey = br.readLine();
			System.out.println("Enter the new price: ");
			newvenueCost = Integer.parseInt(br.readLine());
			Events.venue.replace(venueKey, newvenueCost);
			System.out.println("\nThe modified cost of " + venueKey + " is " + Events.getvenue().get(venueKey));
			adminPanel();
			break;
		case 2:
			String photographerKey = "";
			int newphotographerCost = 0;
			
			Events.printphotographer();
			
			System.out.println("\nEnter the photographer for which the price should be modified: ");
			photographerKey = br.readLine();
			System.out.println("Enter the new price: ");
			newphotographerCost = Integer.parseInt(br.readLine());
			Events.photographer.replace(photographerKey, newphotographerCost);
			System.out.println("\nThe modified cost of " + photographerKey + " is " + Events.getphotographer().get(photographerKey));
			adminPanel();
			break;
		case 3:
			String cateringMarriageKey = "";
			int cateringMarriageCost = 0;
			
			Events.printCateringMarriage();
			
			System.out.println("\nEnter the catering for marriage for which the price should be modified: ");
			cateringMarriageKey = br.readLine();
			System.out.println("Enter the new price: ");
			cateringMarriageCost = Integer.parseInt(br.readLine());
			Events.cateringMarriage.replace(cateringMarriageKey, cateringMarriageCost);
			System.out.println("\nThe modified cost of " + cateringMarriageKey + " is " + Events.getcateringMarriage().get(cateringMarriageKey));
			adminPanel();
			break;
		case 4:
			String cateringBirthdayKey = "";
			int cateringBirthdayCost = 0;
			
			Events.printcateringBirthday();
			
			System.out.println("\nEnter the catering for Birthday for which the price should be modified: ");
			cateringBirthdayKey = br.readLine();
			System.out.println("Enter the new price: ");
			cateringBirthdayCost = Integer.parseInt(br.readLine());
			Events.cateringBirthday.replace(cateringBirthdayKey, cateringBirthdayCost);
			System.out.println("\nThe modified cost of " + cateringBirthdayKey + " is " + Events.getcateringBirthday().get(cateringBirthdayKey));
			adminPanel();
			break;
		}		
	}
	
	public void venueAddition() throws IOException {
		System.out.println("Select the option to which addition is to made");
		System.out.println("1. venue");
		System.out.println("2. photographer");
		System.out.println("3. Catering Marriage");
		System.out.println("4. Catering Birthday");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String venueKey = "";
			int newvenueCost = 0;
			
			Events.printvenue();
			
			System.out.println("\nEnter the new venue: ");
			venueKey = br.readLine();
			System.out.println("Enter the price for venue: ");
			newvenueCost = Integer.parseInt(br.readLine());
			Events.venue.put(venueKey, newvenueCost);
			System.out.println("\nThe event place " + venueKey + " has been added with the price of " + Events.getvenue().get(venueKey));
			adminPanel();
			break;
		case 2:
			String photographerKey = "";
			int newphotographerCost = 0;
			
			Events.printphotographer();
			
			System.out.println("\nEnter the new photographer: ");
			photographerKey = br.readLine();
			System.out.println("Enter the new price for the photographer: ");
			newphotographerCost = Integer.parseInt(br.readLine());
			Events.photographer.put(photographerKey, newphotographerCost);
			System.out.println("\nThe cheese type " + photographerKey + " has been added with the price of " + Events.getphotographer().get(photographerKey));
			adminPanel();
			break;
		case 3:
			String cateringMarriageKey = "";
			int cateringMarriageCost = 0;
			
			Events.printCateringMarriage();
			
			System.out.println("\nEnter the new veg base topping: ");
			cateringMarriageKey = br.readLine();
			System.out.println("Enter the new price: ");
			cateringMarriageCost = Integer.parseInt(br.readLine());
			Events.cateringMarriage.put(cateringMarriageKey, cateringMarriageCost);
			System.out.println("\nThe veg base topping " + cateringMarriageKey + " has been added with the price of " + Events.getcateringMarriage().get(cateringMarriageKey));
			adminPanel();
			break;
		case 4:
			String cateringBirthdayKey = "";
			int cateringBirthdayCost = 0;
			
			Events.printcateringBirthday();
			
			System.out.println("\nEnter the new non veg base topping: ");
			cateringBirthdayKey = br.readLine();
			System.out.println("Enter the new price: ");
			cateringBirthdayCost = Integer.parseInt(br.readLine());
			Events.cateringBirthday.put(cateringBirthdayKey, cateringBirthdayCost);
			System.out.println("\nThe nonveg base topping " + cateringBirthdayKey + " has been added with the price of " + Events.getcateringBirthday().get(cateringBirthdayKey));
			adminPanel();
			break;
		}		
	}
	
	public void venueDeletion() throws IOException {
		System.out.println("Select the Option from which deletion has to be done");
		System.out.println("1. venue");
		System.out.println("2. photographer");
		System.out.println("3. Catering Marriage");
		System.out.println("4. Catering Birthday");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		switch(choice) {
		case 1:
			String venueKey = "";
			
			Events.printvenue();
			
			System.out.println("\nEnter the venue to be deleted: ");
			venueKey = br.readLine();
			Events.venue.remove(venueKey);
			System.out.println("\nThe venue " + venueKey + " has been deleted");
			adminPanel();
			break;
		case 2:
			String photographerKey = "";
			
			Events.printphotographer();
			
			System.out.println("\nEnter the photographer to be deleted: ");
			photographerKey = br.readLine();
			Events.photographer.remove(photographerKey);
			System.out.println("\nThe photographer " + photographerKey + " has been deleted");
			adminPanel();
			break;
		case 3:
			String cateringMarriageKey = "";
			
			Events.printCateringMarriage();
			
			System.out.println("\nEnter the catering for marriage to be deleted: ");
			cateringMarriageKey = br.readLine();
			Events.cateringMarriage.remove(cateringMarriageKey);
			System.out.println("\nThe catering for marriage " + cateringMarriageKey + " has been deleted");
			adminPanel();
			break;
		case 4:
			String cateringBirthdayKey = "";
			
			Events.printcateringBirthday();
			
			System.out.println("\nEnter the catering for birthday to be deleted: ");
			cateringBirthdayKey = br.readLine();
			Events.cateringBirthday.remove(cateringBirthdayKey);
			System.out.println("\nThe catering for birthday " + cateringBirthdayKey + " has been deleted");
			adminPanel();
			break;
		}		
	}
	
	
	public void viewVenueAndPrice() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nSelect the option to be viewed");
		System.out.println("1. venue");
		System.out.println("2. photographer");
		System.out.println("3. Marriage");
		System.out.println("4. Birthday");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			Events.printvenue();
			adminPanel();
			break;
		case 2:
			Events.printphotographer();
			adminPanel();
			break;
		case 3:
			Events.printCateringMarriage();
			adminPanel();
			break;
			
		case 4:
			Events.printcateringBirthday();
			adminPanel();
			break;
		}
	}

}
