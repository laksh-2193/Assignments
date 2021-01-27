    //import java.util.Scanner;
    public class quad
    {
        public static int a=0,b=0,c=0;
        public static double dis=0.0d;
        public static double x1=0, x2=0;
        public static void main(int a1,int b1,int c1)
        {
            a=a1;
            b=b1;
            c=c1;
            quad calc = new quad();
            
            dis = calc.discriminant(a,b,c);
            calc.root(dis);
            calc.root_equal();
            calc.image();
            calc.root_real();
              
        
    }
    float discriminant(int x, int y, int z)
    {
        dis = (b*b)-(4*a*c);
        return (float)dis;
    }
    void root(double d)
    {
        x1 = ((-b)+(Math.sqrt(dis)))/(2*a);
        x2 = ((-b)+(Math.sqrt(dis)))/(2*a);
        System.out.println("Roots are : "+x1+" and "+x2);     
    }
    void root_equal()
    {
        if(x1==x2)
        {
            System.out.println("Roots are equal");
        }
        else
        {
            System.out.println("Roots are not equal");
        }
    }
    void image()
    {
        if(dis<0)
        {
            System.out.println("Roots are imagery");
            
        }
        
    }
    void root_real()
    {
        if((dis==0))
        {
            System.out.println("Roots are real");
            
        }
    }
    
}