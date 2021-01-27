import java.util.Scanner;
public class complex
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Please enter the value of a and b (a+ib) respectively");
       System.out.println("Complex no 1");
       int a = in.nextInt();
       int b = in.nextInt();
       
       System.out.println("Comples no 2");
       int x = in.nextInt();
       int y = in.nextInt();
       complex num = new complex();
       num.add(a,b,x,y);
       
       
    }
    void add(int a1,int b1,int x1,int y1)
    {
        System.out.println((a1+x1)+"+"+(b1+y1)+"i");
    }
    
}