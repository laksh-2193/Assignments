//WAP to input a String and print the given string in reverse order with dashes '-'
import java.util.Scanner;
public class Strings
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = in.nextLine();
        word = word.toLowerCase();
        StringBuffer str = new StringBuffer(word);
        String rev = str.reverse().toString();
        String fw="", bw="";
        
        for(int i = 0;i<word.length();i++)
        {
            fw = fw+word.charAt(i)+"-";
            bw = bw+rev.charAt(i)+"-";
            
        }
        System.out.println(fw+"\n"+bw);
    }
}

        