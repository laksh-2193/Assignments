import java.util.Scanner;

//WAP to swap adjacent pair characters of string

public class SwapPairStrings
{
    String swapPairs(String str){
            int len = str.length();
            int last = 0;
            if(len%2==0){
                last = len-1;
                
            }
            else{
                last = len-2;
            
            }
            StringBuffer sb = new StringBuffer(str);
            char ch1, ch2;
            for(int i=0;i<last;i+=2){
                ch1 = sb.charAt(i);
                ch2 = sb.charAt(i+1);
                sb.setCharAt(i,ch2);
                sb.setCharAt(i+1,ch1);
            }
            return sb.toString();
        }
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter string/line of text :");
            String origStr = in.nextLine();
            
            SwapPairStrings sobject = new SwapPairStrings();
            String outStr = sobject.swapPairs(origStr);
            System.out.println("Output string after swapping ");
            System.out.println(outStr);
            
        }
    }
  