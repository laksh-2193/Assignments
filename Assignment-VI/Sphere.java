public class Sphere  extends Circle
{
    public void ShowCharacterstics(){
        System.out.println("Sphere Characterstics");
        System.out.println("Side : "+getRadious());
        System.out.println("Diameter :"+calculateDiameter());
        System.out.println("Circumference :"+calculateCircumference());
        System.out.println("Area :"+calculateArea());
    }
    public double calculateArea(){
        return 4*getRadious()*getRadious()*3.14159;
    }
    public double calculateVolume(){
        return 4*getRadious()*getRadious()*3.14159*getRadious()/3;
    }
}