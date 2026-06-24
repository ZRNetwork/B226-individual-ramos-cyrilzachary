
package day6.discussion;

public class LogicalOperator {
    public static void main(String[] args) {
        // Logical && {AND} and || (OR)
        
//        int num = 100;
//        int num2 = 200;
//        
//        boolean result = num < num2 && num > num2;
//        System.out.println(result)

        // Cinema Logic
        boolean hasTicket = true;
        boolean hasVaccinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = false;
        
        // AND (&&) if ticket = true, entrace = true
        System.out.println("Allowed to Enter Cinema: " + (hasTicket && hasVaccinationCard));
        
        
        // OR (||) Studet/Senior = true, discount = true
        System.out.println("Eligible for Discount: " + (isStudent || isSeniorCitizen));
        
        
        // NOT (!) App log-in = false
        System.out.println("Cannot Reserve Seat: " + !isLoggedIn);
      
    }
    
}
