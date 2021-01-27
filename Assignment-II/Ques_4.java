/**
 *  Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print
an error message.
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant 
 */
import java.util.Scanner;
public class Ques_4
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a character");
       char ch = (in.next()).charAt(0);
       int ascii = (int)ch;
       if((ch>='a')&&(ch<='z'))
       {
           if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='U'))
           {
               System.out.println("Vowel");
            }
            else
            {
                System.out.println("consonant");
            }
        }
        else if((ch>='A')&&(ch<='Z'))
        {
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
           {
               System.out.println("Vowel");
            }
            else
            {
                System.out.println("consonant");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}