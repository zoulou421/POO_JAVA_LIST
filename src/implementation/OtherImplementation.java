package implementation;


import java.util.ArrayList;
import java.util.Scanner;

import entities.User;

	public class OtherImplementation {

	    private static ArrayList<User> users = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String choice;

	        do {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Add User");
	            System.out.println("2. Update User");
	            System.out.println("3. Delete User");
	            System.out.println("4. Find User");
	            System.out.println("5. Display All Users");
	            System.out.println("6. Exit");

	            choice = scanner.nextLine();

	            switch (choice) {
	                case "1":
	                    addUser();
	                    break;
	                case "2":
	                    updateUser();
	                    break;
	                case "3":
	                    deleteUser();
	                    break;
	                case "4":
	                    findUser();
	                    break;
	                case "5":
	                    displayUsers();
	                    break;
	                case "6":
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (!choice.equals("6"));

	        scanner.close();
	    }

	    // Method to add a User
	    private static void addUser() {
	        System.out.println("Enter user name: ");
	        String name = scanner.nextLine();

	        System.out.println("Enter user age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline

	        users.add(new User(name, age));
	        System.out.println("User added successfully.");
	    }

	    // Method to update a User
	    private static void updateUser() {
	        System.out.println("Enter the name of the user to update: ");
	        String name = scanner.nextLine();
	        User user = findUserByName(name);

	        if (user != null) {
	            System.out.println("Enter new name: ");
	            String newName = scanner.nextLine();
	            System.out.println("Enter new age: ");
	            int newAge = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline

	            user.setName(newName);
	            user.setAge(newAge);
	            System.out.println("User updated successfully.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    // Method to delete a User
	    private static void deleteUser() {
	        System.out.println("Enter the name of the user to delete: ");
	        String name = scanner.nextLine();
	        User user = findUserByName(name);

	        if (user != null) {
	            users.remove(user);
	            System.out.println("User deleted successfully.");
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    // Method to find a User
	    private static void findUser() {
	        System.out.println("Enter the name of the user to find: ");
	        String name = scanner.nextLine();
	        User user = findUserByName(name);

	        if (user != null) {
	            System.out.println("User found: " + user);
	        } else {
	            System.out.println("User not found.");
	        }
	    }

	    // Helper method to find a User by name
	    private static User findUserByName(String name) {
	        for (User user : users) {
	            if (user.getName().equalsIgnoreCase(name)) {
	                return user;
	            }
	        }
	        return null;
	    }

	    // Method to display all Users
	    private static void displayUsers() {
	        if (users.isEmpty()) {
	            System.out.println("No users in the list.");
	        } else {
	            System.out.println("Users in the list:");
	            for (User user : users) {
	                System.out.println(user);
	            }
	        }
	    }
	}



