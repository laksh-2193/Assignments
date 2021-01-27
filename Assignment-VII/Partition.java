import java.util.Scanner;
class Partition{
    public static void partition(int n)
    {
        partition(n,n,"");
    }
    public static void partition(int n,int max,String prefix){
        if(n==0){
            System.out.println(prefix);
            return;
        }
        for(int i=Math.min(max,n);i>=1;i--){
            partition(n-1,i,prefix+""+i);
        }
    }
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter n to be partitioned:");
        int N=in.nextInt();
        System.out.println("All possible partitions of"+N+"are:");
        partition(N);
    }
}
