package com.Ecommerce;
import java.util.HashMap;
import java.util.*;

class customer{
    private static HashMap<String, String> customerDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        customerDatabase.put("jeev", "123");
        customerDatabase.put("abc", "456");
        
        System.out.println("Welcome to SnapCart!");
       
        if (login()) {
            displayMenu();
        } else {
            System.out.println("Exit SnapCart. Please try again later.");
        }
    }

    private static boolean login() {
        System.out.println("\n--- Your Login ---");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (customerDatabase.containsKey(username) && customerDatabase.get(username).equals(password)) {
            System.out.println("\nLogin Successful! Welcome, " + username + "!");
            return true;
        } else {
            System.out.println("\nInvalid credentials! Please try again.");
            return false;
        }
    }

    private static void displayMenu() {
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. search");
            System.out.println("2. View Cart");
            System.out.println("3. Place Order");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.println("\nsearch products...");
                    break;
                case 2:
                    System.out.println("\nDisplaying items in your cart...");
                    break;
                case 3:
                    System.out.println("\nProcessing your order...");
                    break;
                case 4:
                    System.out.println("\nLogging out... Thank you for visiting!");
                    return;
                default:
                    System.out.println("\nInvalid choice! Please select a valid option.");
            }
        }
    }
}
