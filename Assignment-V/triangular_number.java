import java.util.Scanner;
public class triangular_number
{
    public static int num = 0;
    int fl = 0;
    int pt = 0;
    
    public static void main(String args[])
    {
        triangular_number checking = new triangular_number();
        checking.getnum();
        int x = checking.check(num);
        checking.dispnum();
       
    }
    void getnum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        
    }
    int check(int a)
    {
        long sum = 0;
        
        for(int i=1;i<=a;i++)
        {
            sum = sum + i;
            if(sum==num)
            {
                fl=1;
                pt=i;
                break;
            }
            if(sum>a)
            {
                fl=0;
                break;
            }
        }
        return fl;
    }
    void dispnum()
    {
        if(fl==1)
        {
            System.out.println("Triangular number");
            for(int j = 1;j<=pt;j++)
            {
                if(j!=pt)
                System.out.print(j+" + ");
                else if(j==pt)
                {
                    System.out.print(j+" = ");
                }
                
            }
            
                System.out.print(num);
        }
        else
        {
            System.out.println("Not a triangular number");
        }
    }
}