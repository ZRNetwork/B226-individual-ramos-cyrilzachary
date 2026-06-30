package day11.activity;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZR
 */
public class Activity7_Ramos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array for a number variable with maximum 5 elements
        int[] number = new int[5];
        
        // We share to the user they need to enter 5 numbers
        System.out.println("Enter 5 numbers");
        
        // This is where they will be entering the numbers, one by one in a loop
        // It stops once i is no longer less than 5
        // It stops at 5 as the array can only have 5 elements
        for (int i = 0; i < number.length; i++) { // we used number.length on the entire code so that it dynamically changes according to the size of the array
            System.out.print("Number " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }
        
        int count = 0; // This is to count the index of the printed values
        
        System.out.println("\nThis is the numbers you've given");
        for (int numbers : number) { // This prints out the given numbers from before
            System.out.println("Index " + count + ": " + numbers);
            count++;
            // Every loop, count increments so we have our own index counter
            // For-each loop hides the index, so we cant do what the for loop does
            // We had to create our own counter
        }
        
        // This is for getting the sum of all of the elements
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i]; // we keep adding the numbers from the index until we reach the last element
        }
        
        // This is for getting the average
        int aver = 0;
        aver = sum / number.length; // Sum divided by the maximum number of elements of the array
        
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + aver);
        
        int highest = number[0]; // we are just declaring the variables for finding highest and lowest number
        int lowest = number[0]; // the value of the variable is the first element of the array
        
        for (int i = 1; i < number.length; i++) { // we loop through the array
            if (number[i] > highest) { // we compare if the value of the highest var is less than the current element
                highest = number[i]; // if the value of highest var is less than, we change the value of the var to the current element then repeat
            }
        }
        
        for (int i = 1; i < number.length; i++) { // same process as before
            if (number[i] < lowest) {
                lowest = number[i];
            }
        }
        
        // We print out the elements that are highest and lowest within the array
        System.out.println("The highest number is: " + highest);
        System.out.println("The lowest number is: " + lowest);
    }
}
