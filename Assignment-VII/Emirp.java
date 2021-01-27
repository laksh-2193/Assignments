import java.util.Scanner ;
public class Emirp {
int n,rev,f;
public Emirp(int nn) {
n=nn ;
rev=0;
f=2;
}
int isprime(int x) {
if ( x > Math.sqrt(n))
return 1;
else if (n==2||n==3)
return 1;
else if (n==1||n%x==0)
return 0;
else
return isprime (x+1);
}
void isEmirp() {
int nn = n,d ;
while (nn>0){
d=nn%10;
nn=nn/10;
rev=rev*10+ d ;
}
int chk1,chk2;
int origNo=n;
chk1=isprime(f);
// check if n is prime
// reinitialize divisor and number to be tested
f=2;
// set n to rev for testing purpose
n=rev;
chk2=isprime(f);
// check if rev is prime ( n set to rev now)
n=origNo;
// restore original n
System.out.println("Original number :" + n) ;
System.out.println("Reversed number :" + rev);
if (chk1==1&&chk2==1)
System.out.println(n + " is an Emirp number.");
else
System.out.println(n + " is NOT an Emirp number.");
}
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
System.out.println("Enter a number");
int a=kb.nextInt();
Emirp num = new Emirp(a) ;
num.isEmirp();
}
}
