/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

import java.util.Scanner;

/**
 *
 * @author ZR
 */
public class SingleDimensionalArray {
    public static void main(String[] args) {
         int[] ages = {24, 43, 35, 18, 28, 25};
         //System.out.println(ages[2]);
         
         // Mini Activity
         // For Loop
         System.out.println("For Loop");
         for (int i = 0; i < ages.length; i++) {
             System.out.println(ages[i]);
         }
         
         // For-Each Loop
         System.out.println("\nFor-Each Loop");
         for (int age : ages) {
             System.out.println(age);
         }
         
         // String[] names = {"Michael", "Leslie", "Kent", "Ray", "Jeff"};
         // System.out.println(names.length);
         
         // Traversing an array using for loop
//         for (int i = 0; i < names.length; i++) {
//             System.out.println(names[i]);
//         }
         
//         // Traversing an array using for-each loop / enhanced for loop
//         for (String name : names) {
//             System.out.println(name);
//         }

        Scanner scanner = new Scanner(System.in);
        String[] anime = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter anime title: ");
            anime[i] = scanner.nextLine();
        }
        
        System.out.println("\nAnime you entered: ");
        for (String title : anime) {
            System.out.println(title);
        }
         
         


    }
}
