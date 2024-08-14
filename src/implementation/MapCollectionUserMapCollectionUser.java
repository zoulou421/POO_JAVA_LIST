package implementation;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.User;

public class MapCollectionUserMapCollectionUser {

    private static Map<String, User> userMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add User");
            System.out.println("2. Display All Users");
            System.out.println("3. Exit");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addUser();
                    break;
                case "2":
                    displayUsers();
                    break;
                case "3":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }

    // Method to add a User to the Map using insertUser
    private static void addUser() {
        System.out.println("Enter user name: ");
        String name = scanner.nextLine();

        System.out.println("Enter user age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create a new User object
        User user = new User(name, age);

        // Insert the user into the Map
        insertUser(name, user);
        System.out.println("User added successfully.");
    }

    // Method to insert a User into the Map
    private static void insertUser(String key, User user) {
        // Check if the key already exists
        if (userMap.containsKey(key)) {
            System.out.println("User with the name '" + key + "' already exists. Updating existing user.");
        }
        // Insert or update the User in the Map
        userMap.put(key, user);
    }

    // Method to display all Users in the Map
    private static void displayUsers() {
        if (userMap.isEmpty()) {
            System.out.println("No users in the map.");
        } else {
            System.out.println("Users in the map:");
            for (Map.Entry<String, User> entry : userMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
