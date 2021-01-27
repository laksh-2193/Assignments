//WAP that calculates password of according to give name and age.
import java.util.Scanner;

public class PasswordMaker
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name\nMiddle name\nLast name");
        String fn = in.next();
        String mn = in.next();
        String ln = in.next();
        int fl = 0, ml = 0, ll = 0;
        System.out.println("Enter Age");
        int age = in.nextInt();
        
        mn = mn+" ";
        ln = ln+" ";
        
        fl = fn.length()-1;
        ml = mn.length()-1;
        ll = ln.length()-1;
        
        String password = ln.substring(0,1)+ln.substring(ll-1,ll)+age/10+fn.charAt(0)+fn.charAt(fl)+age%10+mn.charAt(0)+mn.substring(ml-1,ml);
        System.out.println("Password is "+password);
    }
}