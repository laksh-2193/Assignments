class Plane{
    protected int x1;
    protected int y1;
    public Plane(int x, int y){
        x1 = x;
        y1 = y;
    }
    public void show(){
        System.out.println("x1: " + x1);
        System.out.println("y1: " + y1);
    }
}
class Circle extends Plane{
    protected int x2;
    protected int y2;
    protected double radius;
    protected double area;
    public Circle(int a, int b, int c, int d){
        super(a, b);
        x2 = c;
        y2 = d;
        radius = 0.0;
        area = 0.0;
    }
    public void findRadius(){
        radius = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) / 2;
    }
    public void findArea(){
        area = 3.14 * radius * radius;
    }
    public void show(){
        super.show();
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}