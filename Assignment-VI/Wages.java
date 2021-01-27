public class Wages extends Worker
{
    int hrs;
    double rate;
    double wage;
    Wages(String nm,double bas, int hr, double rt){
        super(nm,bas);
        hrs = hr;
        rate = rt;
    }
    double overtime(){
        return hrs*rate;
    }
    void display(){
        super.display();
        wage = overtime()+Basic;
        System.out.println("Hours worked "+hrs);
        System.out.println("Rate: "+rate);
        System.out.println("Wage "+wage);
    }
}    