
package day5.discussion;


public class UnaryOperator {
    public static void main(String[] args) {
        // Negating an Expression (-)
        int num = 10;
        System.out.println(-num);
        
        // Inverting the Value of a Boolean (!)
        boolean isEnrolled = false;
        System.out.println(!isEnrolled);
        
        // Incement / Decrement a Value by One (++ / --)
        int number = 50;
        // Pre-Increment
        //System.out.println(++number);
        //System.out.println(--number);
        
        // Post Increment - Makes an Increment but Delayed
        //System.out.println(number++);
        System.out.println(number--);
        System.out.println(number);
        
    }
    
}
