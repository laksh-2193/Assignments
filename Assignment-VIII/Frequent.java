//WAP to input a string and return the string with words with multiple occurrance and the words between them. 
import java.util.Scanner;
public class Frequent
{
    String text;
    Frequent(String s){
        text = s;
    }
    String extracText(String subs){
        int start = text.indexOf(subs);
        start = start+1;
        char ch = text.charAt(start);
        while(ch != ' '){
            start = start+1;
            ch = text.charAt(start);
        }
        int end = text.lastIndexOf(subs);
        return text.substring(start+1,end);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of text having multiple occurance");
        String str = in.nextLine();
        System.out.println("Enter a word with multiple occurance");
        String sub = in.next();
        
        Frequent obj = new Frequent(str);
        String extractedwd = obj.extracText(sub);
        System.out.println("Output : \n"+extractedwd);
        
        
        
    }
}