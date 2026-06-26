
package day7.activity;

import java.util.Scanner;

public class Activity4_Ramos {
    public static void main(String[] args) {
        System.out.println("=== Main Menu === \n 1. Start Game"
        + "\n 2. Load Game"
        + "\n 3. Settings"
        + "\n 4. Exit");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice (1-4): ");
        int menuSelect = input.nextInt();
        
        if (menuSelect == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (menuSelect == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (menuSelect == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (menuSelect == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid selection");
    }
        
    }
    
}
