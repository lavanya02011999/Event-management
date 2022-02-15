package Birthday;
import java.util.Scanner;
import java.util.Map.Entry;
import EventDetailes.Events;
import Marriage.Marriage;

public class Birthday extends Marriage{
	
	@Override
	public void CateringMarriageSelection() {
		int cateringBirthdayCost = 0;
		String cateringBirthdayChoice = "";
		
		System.out.println("\nFollowing are the available types of non veg base toppings along with their price: ");
		Events.printcateringBirthday();
		
		Scanner sc = new Scanner(System.in);
		
		boolean cateringBirthdayChoicevalidation = false;
		while(!cateringBirthdayChoicevalidation) {
			System.out.println("\nPlease enter your choice for catering: ");
			cateringBirthdayChoice = sc.nextLine();
			if(Events.getcateringBirthday().containsKey(cateringBirthdayChoice)) {
				cateringBirthdayCost = Events.getcateringBirthday().get(cateringBirthdayChoice);
				cateringBirthdayChoicevalidation = true;
			}
			else {
				cateringBirthdayChoicevalidation = false;
				System.out.println("Make sure there is no spelling errors.");
			}
		}
		
		totalCost = totalCost + cateringBirthdayCost;
		System.out.println("\n chosen: " + cateringBirthdayChoice);
		System.out.println("Cost so far: " + totalCost);
	}
}


