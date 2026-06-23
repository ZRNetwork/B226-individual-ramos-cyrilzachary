
package day5.discussion;

public class AssignmentOperator {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 10;
        
        // Simple Assignment
        num2 = num2 + 10;
        
        // Compound Assignment
        num += 10; // Read as "Num plus equal 10"
        System.out.println(num);
        // Substract
        num -= 5;
        System.out.println(num);
        // Multiply
        num *= 5;
        System.out.println(num);
        // Divide
        num /= 5;
        System.out.println(num);
        // Mod
        num %= 2;
        System.out.println(num);
    }
}
