
/**
 * Program to reduce the fraction to the lowest term
 */
public class Ques_10
{
            static void reduceFraction(int x, int y)  
        {  
            int d;  
            d = __gcd(x, y);  
          
            x = x / d;  
            y = y / d;  
          
            System.out.println("x = " + x + ", y = " + y + " i.e. "+ x + "/" + y);  
        }  
          
        static int __gcd(int a, int b)  
        {  
            if (b == 0)  
                return a;  
        return __gcd(b, a % b);  
          
    } 
  
// Driver Code  
    public static void main(int numerator, int denominator) 
    { 
         int x = numerator;
         int y = denominator;
      
        reduceFraction(x, y); 
    } 
    
} 