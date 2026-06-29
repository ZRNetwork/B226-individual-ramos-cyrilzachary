/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.discussion;

import java.util.Scanner;

/**
 *
 * @author ZR
 */
public class ForLoopStatement {
    public static void main(String[] args) {
        // Syntax
        // Print your name 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ": Winter");
        }
        
        // Calculates the sum of numbers from 1 to 5:
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        
        System.out.println(sum);
        
        // Mini-Activity: Calculates the product of numbers from 1 to 5
        int prod = 1;
        for (int i = 1; i <= 5; i++) {
            prod *= i;
        }
        
        System.out.println(prod);
        
        // Factorial with User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        long product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        
        System.out.println("Product: " + product);
        
        
        // Check if the number is even
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
