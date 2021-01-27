public class Circle
{
    private double radious;
    public double getRadious(){
        return radious;
    }
    public void setRadious(double value){
        if(radious < 0){
            radious = 0.00;
        }
        else{
            radious = value;
        }
    }
    public double calculateDiameter(){
        return radious*2;
    }
    public double calculateCircumference(){
        return calculateDiameter()*3.14159;
    }
    public double calculateArea(){
        return radious*radious*3.14159;
    }
    public void showCharacterstics(){
        System.out.println("Circle Characterstics");
        System.out.println("Side : "+getRadious());
        System.out.println("Diameter :"+calculateDiameter());
        System.out.println("Circumference :"+calculateCircumference());
        System.out.println("Area :"+calculateArea());
    }
}