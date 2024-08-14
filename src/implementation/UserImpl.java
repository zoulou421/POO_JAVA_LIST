package implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.User;

public class UserImpl implements IUser{

	Scanner scanner=new Scanner(System.in);
	ArrayList<User> users = new ArrayList<>();
		
	@Override
	public void addUserInList(List<User> myListUsers) {
		
		String choice;

        do {
            // Add User to ArrayList
            users.add(inPutUser());
            System.out.println("Do you want to add another user? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // Display the users
        System.out.println("Users in the list:");
        for (User user : users) {
            System.out.println(user);
        }

        scanner.close();
    }
	
	public User inPutUser() {
		String name;
	     int age;
	     
	     User u=new User();
	    
		System.out.println("Enter user name: ");
        name = scanner.nextLine();
        u.setName(name);

        System.out.println("Enter user age: ");
        age = scanner.nextInt();
        u.setAge(age);
        scanner.nextLine();  // Consume the newline
		return u;

	}

	@Override
	public User findUserByUserName(String name) {
		for(User u:users) {
			if(u.getName().equalsIgnoreCase(name)) {
				return u;
			}
		}
		return null;
	}

	@Override
	public User findUserById(int age) {
		for(User u:users) {
			if(u.getAge()==age) {
				return u;
			}
		}
		return null;
	}

	@Override
	public void findUser() {
		// TODO Auto-generated method stub
		
	}

}

