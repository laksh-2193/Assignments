
/**
 * Program to check whether the input is magic number or not    
 */
public class Ques_4
{
    public static boolean isMagic(int n) 
   { 
       int sum = 0; 
       
              while (n > 0 || sum > 9) 
       { 
           if (n == 0) 
           { 
               n = sum; 
               sum = 0; 
           } 
           sum += n % 10; 
           n /= 10; 
       } 
       
       // Return true if sum becomes 1. 
       return (sum == 1); 
   } 
    
   // Driver code 
   public static void main(int n) 
    { 
     
     if (isMagic(n)) 
        System.out.println("Magic Number"); 
           
     else
        System.out.println("Not a magic Number"); 
    } 
} 