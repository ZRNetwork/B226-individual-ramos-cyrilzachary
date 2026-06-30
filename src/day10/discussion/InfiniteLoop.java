/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

import java.util.Scanner;

/**
 *
 * @author ZR
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        // Syntax of While Loop
//        int counter = 1;
//        while (true) {
//            System.out.println(counter + ": Hello");
//            counter++;

        Scanner input = new Scanner(System.in);
        
        int pin = 123456;
        int enteredPin;
        
        System.out.print("Entere your PIN: ");
        enteredPin = input.nextInt();
        
        if (pin != enteredPin) {
            System.out.println("Invalid PIN, try again.");
        }
    }
    
}
