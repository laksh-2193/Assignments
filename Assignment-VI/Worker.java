public class Worker
{
    String Name;
    double Basic;
    Worker(String nm,double bas){
        Name = nm;
        Basic = bas;
    }
    
    void display(){
        System.out.println("NAME "+Name);
        System.out.println("BASIC "+Basic);
    }
}
        