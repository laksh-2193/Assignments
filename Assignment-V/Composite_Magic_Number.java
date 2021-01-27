import java.util.Scanner;
//Accept two positive integers m and n, where m is less than n as user input. Display the number of Composite magic integers that are in the range between m and n (both inclusive) and output them along with the frequency
public class Composite_Magic_Number
{
    int cf = 0;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of m and n");
        int m = in.nextInt();
        int n = in.nextInt();
        Composite_Magic_Number check = new Composite_Magic_Number();
        int comp_check = 0;
        int freq = 0;
        int magic_check = 0;
        int status = 0;
        int cn1=0, cn2=0;
        
            for(int i = m;i<=n;i++)
            {
                cn1 = check.count_fact(i);
                cn2 = check.magic_check(i);
                if((cn1==1)&&(cn2==1))
                {
                    System.out.println(i+" ");
                    freq++;
                }
                
            }
            System.out.println("FREQUENCY IS : "+freq);
        
        
    }
    int count_fact(int a)
    {
        int ispos = 0;
        for(int j = 1;j<=a;j++)
        {
            if(a%j==0)
            {
                cf++;
            }
            
                
        }
        
        if(cf>2)
        {
            ispos = 1;
        }
        else
        {
            ispos=0;
        }
        return ispos;
        
    }
    int ismagic = 0;
    int sum=0;
    int magic_check(int x)
    {
              while(x>9)
            {
             sum=x;
             int s=0;
             while(sum!=0)
             {
                 s=s+(sum%10);
                 sum=sum/10;
             }
             x=s;
         }
            
            return x;
         
    }
}