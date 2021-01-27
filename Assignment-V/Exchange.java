import java.util.Scanner;
public class Exchange
{
    String sen = "", rev="";
    int size=0;
    Scanner in = new Scanner(System.in);
    String ax[] = new String[size];
    String rs[] = new String[size];
    int fp=0,lp=0,sp=0;
    
    void readSentence()
    {
        System.out.println("Enter a sentence");
        sen = in.nextLine();
        sen = sen + " ";
        size = sen.length();
        
    }
    void exfirstlast()
    {
        for(int i = 0;i<size;i++)
        {
            char ch = sen.charAt(i);
            if(ch==' ')
            {
                sp++;
                lp = i;
                ax[sp] = sen.substring(fp,lp);
                fp=lp+1;
                rs[sp] = ax[sp].charAt(0) + ax[sp].substring(fp+1,lp-1) + ax[sp].charAt(i-1);
            }
        }
    }
    void display()
    {
        for(int j = 0;j<sp;j++)
        {
            System.out.print(rs[j]+" ");
        }
    }
    public static void main(String args[])
    {
        Exchange wd = new Exchange();
        wd.readSentence();
        wd.exfirstlast();
        wd.display();
        
    }
}