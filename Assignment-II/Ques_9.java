/**
 * Write a Program in Java to input 2 numbers and find their Greatest Common Divisor (GCD).
Note: If the 2 numbers are 54 and 24, 
then the divisors (factors) of 54 are: 1, 2, 3, 6, 9, 18, 27, 54
 */

import java.util.Scanner;
public class Ques_9 {
    //  greatest common divisor
    public static int gcd(int a, int b) {
        int i = a % b;
        while (i != 0) {
            a = b;
            b = i;
            i = a % b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number  :");
        int x = sc.nextInt();
        System.out.print("Second Number :");
        int y = sc.nextInt();

        System.out.println("Greatest Common Divisors: " + gcd(x, y));

    }
}