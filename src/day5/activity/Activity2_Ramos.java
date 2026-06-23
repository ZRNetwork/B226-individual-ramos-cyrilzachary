
package day5.activity;

public class Activity2_Ramos {
    public static void main(String[] args) {
        // Values
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2_500;
        double rent = 4_500;
        double utilityBill = 3_500;
        
        // Getting the Percentages of Each Expense Relative to Income
        double percentFood = foodAllowance / income * 100;
        double percentTranspo = transportation / income * 100;
        double percentRent = rent / income * 100;
        double percentBill = utilityBill / income * 100;
        
        // Getting the Sum of All Expenses
        double expenses = foodAllowance + transportation + rent + utilityBill;
        
        // Remaining Balance from Deducting Expenses
        double remainBal = income - expenses;
        
        // Printing Out Results
        System.out.printf("Income: %.0f%n", income);
        System.out.printf("Food Allowance: %.1f%%\n", percentFood);
        System.out.printf("Transportation: %.1f%%\n", percentTranspo);
        System.out.printf("Rent: %.1f%%\n", percentRent);
        System.out.printf("Utility Bill: %.1f%%\n", percentBill);
        System.out.printf("Remaining Balance: %.0f%n", remainBal);
        
        // For rounding off, we use System.out.printf
        // %.0f%n - the argument / syntax
        // %.0 dictates how precise the round off is,
        // f targets floating-point values such as double / flat
        // %n or \n adds a new line for the next print out
        // For rounding off to whole numbers, use %.0
        // For rounding off to one decimal, use %.1
        // For rounding off to two decimal, use %.2 and so on...
        
        // For the % to show, we uses %% so that JAVA knows
        // we want to print out the % sign
    }
}
