import java.util.Scanner;
public class Record
{
    String[] names;
    int[] rnk;
    Record(){
        names = new String[5];
        rnk = new int[5];
    }
    void readValues(){
        Scanner kb = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Name of student" + (i+1));
            names[i] = kb.next();
            System.out.println("Rank of student"+(i+1));
            rnk[i] = kb.nextInt();
        }
    }
    void display(){
        for(int i = 0;i<5;i++)
        {
            System.out.println("Name "+names[i]+" Rank :"+rnk[i]);
        }
    }
}