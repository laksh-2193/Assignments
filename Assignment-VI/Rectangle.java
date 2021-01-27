
import java.util.Scanner;
public class Rectangle extends Dimesions
{
    Rectangle(){
        super(2);
        System.out.println("--------RECTANGLE----------");
        readSides();
    }
    void calcArea(){
        area = sides[0] * sides[1];    
    }
    void display(){
        System.out.println("RECTANGLE STATISTICS");
        System.out.println("Length "+sides[0]);
        System.out.println("Breadth "+sides[1]);
        calcArea();
        System.out.println("Area : "+area);
    }
}