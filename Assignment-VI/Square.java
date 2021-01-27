
public class Square extends Dimesions
{
    Square(){
        super(1);
        System.out.println("-------SQUARE--------------");
        readSides();
    }
    
    void calcArea(){
        area = sides[0] * sides[0];
    }
    
    void display() {
        System.out.println("SQAURE STATISTICS");
        System.out.println("Side "+sides[0]);
        calcArea();
        System.out.println("Area "+area);
    }
}
