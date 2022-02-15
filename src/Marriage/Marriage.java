package Marriage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map.Entry;

import EventDetailes.Events;
import User.User;
import Marriage.Marriage;
import Admin.Admin;
import Birthday.Birthday;

public class Marriage {
	
	public int totalCost;
	static ArrayList<Integer> qCost = new ArrayList<Integer>();
	
	
	//venue selection
	public void venueSelection() {
		
		int venueCost = 0;
		String venueChoice = "";
		
		System.out.println("\nFollowing are the available venue along with teh price: ");
		Events.printvenue();
		
		Scanner sc = new Scanner(System.in);
		
		boolean venueChoicevalidation = false;
		while(!venueChoicevalidation) {
			System.out.println("\nPlease enter your choice of crust: ");
			venueChoice = sc.nextLine();
			if(Events.getvenue().containsKey(venueChoice)) {
				venueCost = Events.getvenue().get(venueChoice);
				venueChoicevalidation = true;
			}
			else {
				venueChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + venueCost;
		System.out.println("\nCrust chosen: " + venueChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void photographerSelection() {
		
		int photographerCost = 0;
		String photographerChoice = "";
		
		System.out.println("\nFollowing are the available choice of photographers along with their price: ");
		Events.printphotographer();
		
		Scanner sc = new Scanner(System.in);
		
		boolean photographerChoicevalidation = false;
		while(!photographerChoicevalidation) {
			System.out.println("\nPlease enter your choice of cheese: ");
			photographerChoice = sc.nextLine();
			if(Events.getphotographer().containsKey(photographerChoice)) {
				photographerCost = Events.getphotographer().get(photographerChoice);
				photographerChoicevalidation = true;
			}
			else {
				photographerChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + photographerCost;
		System.out.println("\nphotographer chosen: " + photographerChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void CateringMarriageSelection() {
		
		int CateringMarriageCost = 0;
		String CateringMarriageChoice = "";
		
		System.out.println("\nFollowing are the available types of veg base toppings along with their price: ");
		Events.printCateringMarriage();
		
		Scanner sc = new Scanner(System.in);
		
		boolean CateringMarriageChoicevalidation = false;
		while(!CateringMarriageChoicevalidation) {
			System.out.println("\nPlease enter your choice of base topping: ");
			CateringMarriageChoice = sc.nextLine();
			if(Events.getcateringMarriage().containsKey(CateringMarriageChoice)) {
				CateringMarriageCost = Events.getcateringMarriage().get(CateringMarriageChoice);
				CateringMarriageChoicevalidation = true;
			}
			else {
				CateringMarriageChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + CateringMarriageCost;
		System.out.println("\nBase topping chosen: " + CateringMarriageChoice);
		System.out.println("Cost so far: " + totalCost);
	}
	
	public void peopleCount() {
		System.out.println("\nHow many of these Pizza would you require: ");
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();
		totalCost = totalCost * choice;
		if(choice == 1) {
			System.out.println("\nYou have opted for " + choice + " pizza of this type");
		}
		else {
			System.out.println("\nYou have opted for " + choice + " pizzas of this type");
		}
		System.out.println("\nThe cost of the aforementioned order is: " + totalCost);
		qCost.add(totalCost);
	}
	public int overallCost() {
		int overallCost = 0;
		int i;
		
		for (i = 0; i < qCost.size(); i++) {
			overallCost +=  qCost.get(i);
		}
             
		return overallCost;
	}

}
