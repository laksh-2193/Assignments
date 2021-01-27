//to tell the radius, area and perimeter of circle
import java.util.*;
public class circle
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter radius of circle" );
        int r= sc.nextInt();
        System.out.println(" radius of circle is =" +r);
        double a = (22.0/7.0)*r*r;
        double p = 2.0*(22.0/7.0)*r;
        System.out.println(" area of circle =" +a);
        System.out.println(" perimeter of circle =" +p);
    }
}