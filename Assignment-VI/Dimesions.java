import java.util.Scanner;
public class Dimesions
{
    int no_of_sides;
    double sides[];
    double area;
    
    void calcArea(){
        area=0.0;
    }
    
    Dimesions(int num){
        no_of_sides = num;
        sides = new double[num];
    }
    void readSides(){
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<no_of_sides;i++){
            System.out.println("Enter side" + (i+1) + ":");
            sides[i] = in.nextDouble();
        }
    }
}