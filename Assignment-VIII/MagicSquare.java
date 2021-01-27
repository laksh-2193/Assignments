
//WAP to print N by N magic square matrix
import java.util.Scanner;


public class MagicSquare
{
    int[][] magic;
    int N;
    MagicSquare(int n){
        magic = new int[n][n];
        N = n;
    }
    void create(){
        int row = N-1;
        int col = N/2;
        magic[row][col] = 1;
        for(int i = 2;i<=N*N;i++){
            if(magic[(row+1)%N][(col+1)%N]==0){
                row = (row+1)%N;
                col = (col+1)%N;
            }
            else{
                row = (row-1+N)%N;
            }
            magic[row][col]=i;
        }
    }
    void display(){
        sys_printmsg("Magic Square of Order "+N);
        for(int i = 0;i<N;i++){
            for(int j=0;j<N;j++){
               if(magic[i][j]<10)
               System.out.print(" ");
               if(magic[i][j]<100)
               System.out.print(" ");    
               
               System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }
    
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter order N of Magic Square (odd)");
        int N = in.nextInt();
        if(N%2==0){
            System.out.println("N must be odd \n");
            System.exit(0);
        }
        MagicSquare msq = new MagicSquare(N);
        msq.create();
        msq.display();
    
    }
    
    void sys_printmsg(String msgi){
        System.out.println(msgi);
    }
}