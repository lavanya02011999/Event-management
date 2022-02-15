package Welcome;

import java.io.IOException;
import java.util.Scanner;
import User.User;
import Admin.Admin;
import Event.Event;

public class Welcome {
	Scanner scan = new Scanner(System.in);
	public void HomeScreen() throws IOException {
		System.out.println("Welcome To Manjula Events");
		System.out.println("Choose the option");
		System.out.println("1.User");
		System.out.println("2.Admin");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			User user = new User();
			user.event();
			break;
		case 2:
			Admin admin = new Admin();
			admin.adminPanel();
			break;
		}
		
		
		
	}
}
