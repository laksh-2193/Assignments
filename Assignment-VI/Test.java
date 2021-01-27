public class Test
{
   public static void main(String args[])
   {
       Circle round = new Circle();
       round.setRadious(25.55);
       System.out.println("Circle Characterstics");
       System.out.println("Side "+round.getRadious());
       System.out.println("Diameter "+round.calculateDiameter());
       System.out.println("Circumference "+round.calculateCircumference());
       System.out.println("Area "+round.calculateArea());
       
       Sphere ball = new Sphere();
       ball.setRadious(25.55);
       System.out.println("Side "+ball.getRadious());
       System.out.println("Diameter "+ball.calculateDiameter());
       System.out.println("Circumference "+ball.calculateCircumference());
       System.out.println("Area "+ball.calculateArea());
       System.out.println("Volume "+ball.calculateVolume());
    }
}