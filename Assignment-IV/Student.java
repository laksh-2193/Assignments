
/**
 *Program to implement student class and find result of three subjects
 */
import java.util.Scanner;
public class Student
{
    public void result(int m1,int m2,int m3)
    {
        double avg = (m1+m2+m3)/3;
        System.out.println("Average of the marks input are "+avg);
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks in three subjects");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Student obj = new Student();
        obj.result(a,b,c);
    }
}