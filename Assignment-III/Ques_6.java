
/**
 * Program to find twin prime number
 */
import java.io.*;
public class Ques_6
{
    public static boolean isPrime(int n)
        {
            // boolean value will return
            boolean f = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    f = false;
                    break;
                }
            }

            return f;
        }

        // main method begins
        public static void main(String args[]) throws IOException
        {

            int number1, number2;
            // InputStreamReader object
            InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader object
            BufferedReader br = new BufferedReader(in);    
            System.out.print("Enter first number: ");
            // First number
            number1 = Integer.parseInt(br.readLine());
            System.out.print("Enter second number: ");
            // Second number
            number2 = Integer.parseInt(br.readLine());

            // Checking both the number is prime and the difference between two is 2
            if (isPrime(number1) == true && isPrime(number2) == true && Math.abs(number2 - number1) == 2) {
                System.out.println("Twin prime number");
            } else {
                System.out.println("Not twin prime numbers");
            }

        } // end method main
    } // end clas