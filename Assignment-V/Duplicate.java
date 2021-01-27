//Write a program to input a word from the user and remove the duplicate characters present in it.
import java.util.Scanner;
public class Duplicate
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string input");
        String str = in.next();
        str = str.toLowerCase();
        String output = "";
        int t = 0;
        char ch=' ',ch1=' ';
        for(int i=0;i<str.length();i++)
        {
            
            for(int j = 0;j<=(i-1);j++)
            {
                
                if(str.charAt(i)==str.charAt(j))
                {
                    
                    t=1;
                    
                    break;
                }
                
            }
            if(t==0)
            output=output+str.charAt(i);
            
            t=0;
        }
        System.out.println(output);
        
    }
}