
package day6.discussion;

public class TenaryOperator {
    public static void main(String[] args) {
        // (cond) ? true block : false block;
        // Positive or Negative
        int num = 1;
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println(result);
        
        // Fever or Normal Temp
        float temp = 38.5f;
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        System.out.println(tempResult);
        
        // Neutral, Positve, or Negative
        int num2 = 0;
        String result2 = (num2 == 0) ? "Neutral"
                : (num2 > 0) ? "Positve"
                : "Negative";
        System.out.println(result2);
    }
    
}
