/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;
/**
 *
 * @author ZR
 */
public class AgeClassification {
    public static void main(String[] args) {
        /*
        Age: 0 - 12 -> Child
            Age: 0 - 5 -> Toddler
            Age: 6 - 12 -> Pre-Teen
        Age: 13 - 19 -> Teenager
            Age 13 - 15 -> Early Teen
            Age 16 - 19 -> Late Teen
        Age: 20 - 59 -> Adult
            Age 20 - 35 -> Young Adult 
            Age 36 - 59 -> Middle-Aged
        Age: 60 - 120 -> Senior Citizen
            Age 60 - 75 -> Young Senior
            Age 76 - 120 -> Elderly
        */
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        if (age <=12) {
            System.out.println("You are a child");
            if (age <=5) {
                System.out.println("Specifically, you are a toddler");
            } else {
                System.out.println("Specifically, you are a pre-teen");
            }
        } else if (age <=19) {
            System.out.println("You are a teenager");
            if (age <= 15) {
                System.out.println("Specifically, you are an early teen");
            } else {
                System.out.println("Specifically, you are a late teen");
            }
        } else if (age <= 59) {
            System.out.println("You are an adult");
            if (age <= 35) {
                System.out.println("Specifically, you are a young adult");
            } else {
                System.out.println("Specifically, you are a middle-aged");
            }
        } else if (age <= 120) {
            System.out.println("You are a senior citizen");
            if (age <= 75) {
                System.out.println("Specifically, you are a young senior");
            } else {
                System.out.println("Specifically, you are an elderly");
            }
        } else {
            System.out.println("Invalid age");
        }
    }
   
}
