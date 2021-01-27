
/**
 * WAP to print such a triangle that increases by one eachh time:
 * 1
 * 23
 * 456
 * 78910
 */
public class Ques_3
{
    public static void main(String args[])
    {
        int c = 0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                c=c+1;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

        