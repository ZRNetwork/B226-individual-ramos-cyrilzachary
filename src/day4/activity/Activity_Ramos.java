
package day4.activity;

public class Activity_Ramos {
    public static void main(String[] args) {
        // Trainee Info
        System.out.println("Made by Cyril Zachary Ramos");
        System.out.println("");
        
        // Initialize
        boolean isOpen = true;
        byte rank = 10;
        short addressZIP = 1008;
        int digitalCash = 1_000_000;
        
        // Declare
        long planetDistance;
        float notPrecise;
        double Precise;
        char firstLetter;
        String favSentence;
        
        // Assign
        planetDistance = 384_400;
        notPrecise = 3.14f;
        Precise = 3.14159265359;
        firstLetter = 'C';
        favSentence = "Hello World!";
        
        // Printing Values
        // Initiliazation --> Print
        System.out.println("INITIALIAZE THEN PRINT");
        System.out.println("Is the Door open? " + isOpen);
        System.out.println("In Population Size, what rank does Ethiopia hold? Rank " + rank);
        System.out.println("ZIP Code: " + addressZIP);
        System.out.println("GCash Amount: " + digitalCash);
        System.out.println("");
        
        // Declare + Assign --> Print
        System.out.println("DECLARE AND ASSIGN THEN PRINT"); 
        System.out.println("Distance of Earth to the Moon: " + planetDistance + " km"); 
        System.out.println("Pi with 2 decimals: " + notPrecise);
        System.out.println("Pi with 11 decimals: " + Precise);
        System.out.println("First Letter of Your Name: " + firstLetter);
        System.out.println("HTML's Favorite Sentence: " + favSentence);
    }
}
