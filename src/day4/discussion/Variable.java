
package day4.discussion;

public class Variable {
    public static void main(String[] args) {
       // Mini Activity
       // Create a Variable for firstName, middleInitial, lastName
       // Assign Values to It
       // Expected Output: Cyril Zachary M. Ramos
       
       String firstName, middleInitial, lastName;
       
       firstName = "Cyril Zachary ";
       middleInitial = "M. ";
       lastName = "Ramos ";
       
       System.out.println("MINI ACTIVITY");
       System.out.println("Full Name: " + firstName + middleInitial + lastName);

       System.out.println("");
        // initialization
        // DT   var     value
        String timba = "tubig";
        
        // 23
        int age = 23;
        
        // 38.5 temperature
        // declaration
        double temp;
        // assignment
        temp = 38.5;
        
        // 26, 20, 18, 22, 24
        // Multiple Variables
        int age0 = 26, age1 = 20, age2 = 18, age3 = 22, age4 = 24;
        
        // Variables are Mutable
        timba = "bigas";
        // timba = "tubig" became timba = "bigas"
        
        // Printing a Variable
        System.out.println(timba);
        
        // Concantenation (+) --> joins values and/or strings
        System.out.println("Age of Trainer: " + age0);
        System.out.println("Temperature: " + temp);
    }
}