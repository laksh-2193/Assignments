
/**
 * WAP to input a number and find m to the power n where default value of n is 2
 */
public class Power_function
{
    public static void main(int m)
    {
        int n = 2;
        Power_function powe = new Power_function();
        powe.power(m,n);
    }
    public void power(int m,int n)
    {
        double res = Math.pow(m,n);
        System.out.println("Result is "+res);
    }
}