
package day6.activity;

public class Activity3_Ramos {
    public static void main(String[] args) {
        // Allowed to Enter to Event (AND)
        // Age must be 18 and above
        // Must have Valid ID
        int age = 20;
        boolean hasValidID = true;
        
        String access = ((age >=18) && hasValidID) ? "Access Granted"
                : "Access Denied";
        System.out.println(access);
        
        // No Classes Today (OR)
        // No Classes if Weekend OR Holiday
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        String classTracker = (isWeekend || isHoliday) ? "No Classes Today"
                : "There are Classes Today";
        System.out.println(classTracker);
        
        // Student Passed or Failed
        // 75 and above = Passed
        // Below 75 = Failed
        
        int score = 85;
        String remarks = score >= 75 ? "Passed"
                : "Failed";
        System.out.println(remarks);
        
        // Determine the Larger Number
        int num1 = 10;
        int num2 = 25;
        String larger = num1 > num2 ? "The larger number is: " + num1
                : "The larger number is: " + num2;
        System.out.println(larger);
        
        // Stretch Goal
        // Create Program Identifies if it is Odd or Even
        int num3 = 105;
        num3 %= 2; // This gets the remainder of the integer
        String oddEven = num3 == 0 ? "The number is an Even Number"
                : "The number is an Odd Number";
        System.out.println(oddEven);
        
        //String isOddEven = num3 %=
        
    }
    
}
