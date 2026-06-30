/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.activity;

import java.util.Scanner;

/**
 *
 * @author ZR
 */
public class Activity5_Ramos {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       // 5.1 Summation of 1 to N
       System.out.println("5.1 Summation of 1 to N");       
       System.out.print("5.1 Enter a Number for Summation: ");
       int num = input.nextInt();
       
       int sum = 0;
       for (int i = 1; i <= num; i++) {
           sum += i;
           System.out.println("i = " + i + ", " + "Sum = " + sum);
       }
       System.out.println("Final Sum = " + sum);       
       System.out.println(""); // To provide spacing
       
       // 5.2 Product of 1 to N
       System.out.println("5.2 Product of 1 to N");
       System.out.print("5.2 Enter a Number for Factorial: ");
       int prod = input.nextInt();
       
       long facto = 1;
       for (int i = 1; i <= prod; i++) {
           facto *= i;
           System.out.println("i = " + i + ", " + "Product = " + facto);
       }
       System.out.println("Final Product = " + facto);
       System.out.println(""); // To provide spacing
        
       // This gives the term on the position var and prints it in a loop
//        // 5.3 Arithmetic Sequence (Sum Only)
//        int startNum = 1;
//        int commonDiff = 5;
//        int position = 5;
//        int sumSeq = 0;
//        for (int i = 1; i <= position; i++) {
//            int arithSeq = startNum + (position - 1) * commonDiff;
//            sumSeq += arithSeq;
//            System.out.println(arithSeq);
//        }
//        System.out.println(sumSeq);
        
        // 5.3 Arithmetic Sequence (Sum Only)
        System.out.println("5.3 Arithmetic Sequence (Sum Only)");
        System.out.print("5.3 Enter the First Term: ");        
        int startNum = input.nextInt();
        System.out.print("5.3 Enter the Common Difference: ");
        int commonDiff = input.nextInt();
        System.out.print("5.3 Enter the Last Term Position: ");
        int position = input.nextInt();
        int sumSeq = 0;
        for (int i = 0; i < position; i++) {
            System.out.println(startNum);
            sumSeq += startNum;
            startNum += commonDiff;
        }
        System.out.println("Sum of the Arithmetic Sequence: " + sumSeq);
        System.out.println(""); // To provide spacing
        
        // 5.4 Arithmetic Sequence (Sum and Product)
        System.out.println("5.4 Arithmetic Sequence (Sum and Product)");
        System.out.print("5.4 Enter the First Term: ");        
        int firstNum = input.nextInt();
        
        System.out.print("5.4 Enter the Common Difference: ");
        int commonGap = input.nextInt();
        
        System.out.print("5.4 Enter the Last Term Position: ");
        int lastPost = input.nextInt();
        
        int summaSeq = 0;
        long prodSeq = 1;
        for (int i = 0; i < lastPost; i++) {
            System.out.println(firstNum);
            summaSeq += firstNum;
            prodSeq *= firstNum;
            firstNum += commonGap;
        }
        System.out.println("Sum of the Arithmetic Sequence: " + summaSeq);
        System.out.println("Product of the Arithmetic Sequence: " + prodSeq);
        
    }
    
}

