
/**
 * Write a Java program to display the following character rhombus structure.

      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA

 */
import java.util.Scanner;
public class Ques_8
{
   public static void main(String[] args) {
        int rows = 5, k = 0, count = 0, count1 = 0;

        for(int i = 1; i <= rows; ++i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while(k != 2 * i - 1) {
                if (count <= rows - 1) {
                    
                    char c = (char)(i+k+64);
                    System.out.print(c + " ");
                    
                    ++count;
                }
                else {
                    ++count1;
                    char c = (char)(i + k - 2 * count1+64);
                    System.out.print(c + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }
}