/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // User Login Program
        String username = "admin";
        String password = "admin123";
        
        System.out.println("LOGIN");
        
        // Create Scanner object
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter username: "); // Ask for username
        String loginUsername = input.nextLine(); // Read user input and store to variable
        System.out.print("Enter password: "); // Ask for password
        String loginPassword = input.nextLine(); // Read user input and store to variable
        
        // Check user input against login variables
        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Login successful! " + "Welcome," + username);
        } else {
                System.out.println("Login failed. Invalid username or password.");
        }
        
        // We used loginUsername.equals(username) instead of loginUsername == username
        // For Strings, use variable.equals(variable)
        
        // Close the scanner
        input.close();
    }
}
