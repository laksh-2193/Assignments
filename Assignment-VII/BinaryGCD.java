//Q1:To Find GCD greatest common divisor of two positive integers.
import java.util.Scanner;
class BinaryGCD {
int number1,number2,gcd;
BinaryGCD(int a,int b){
    number1=a;
    number2=b;
    gcd=binGcd(number1,number2);
    
}
    public static int binGcd(int p,int q){
        if(q==0)
        return p;
        if(p==0)
        return q;
        if((p&1)==0&&(q&1)==0)//p and q even
        return binGcd(p>>1,q>>1)<<1;
        else if((p&1)==0)
        return binGcd(p>>1,q);
        else if((q&1)==0)
        return binGcd(p,q>>1);
        else if(p>=q)
        return binGcd((p-q)>>1,q);
        else
        return binGcd(p,(q-p)>>1);
    }
    int getGcd(){
        return gcd;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int p=in.nextInt();
        int q=in.nextInt();
        BinaryGCD bcd=new BinaryGCD(p,q);
        System.out.println("gcd("+p+","+q+")="+bcd.getGcd());
    }
}
