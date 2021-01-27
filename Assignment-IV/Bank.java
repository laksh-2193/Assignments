import java.util.Scanner;
public class Bank
{
    Scanner in = new Scanner(System.in);
    long amt=0;
   public static void main(String args[])
   {
       Bank works = new Bank();
       works.AccountDetails();
       works.withdraw();
       works.deposit();
       works.display();
       
    }
    void AccountDetails()
    {
        System.out.println("Enter the name of Account holder");
        String name = in.nextLine();
        System.out.println("Enter the amount in the account");
        amt = in.nextInt();
        
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdrawed");
        int amtwit = in.nextInt();
        amt = amt-amtwit;
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited");
        int depo = in.nextInt();
        amt = amt+depo;
        
    }
    void display()
    {
        System.out.println("Current Balance in account : "+amt);
    
    }
}