import java.util.*;
public class Revstr{
    String Str;
    String Revst;
    Revstr(){
        Str="";
        Revst="";
    }
    public void getstr() {
Scanner in = new Scanner(System.in);
System.out.println("Enter string:");
try {
Str = in.next();
}
catch (Exception e) {
System.out.println(e) ;
}
Revst="";
}
public void recReverse(int i) {
if (i == 0 ) {
return;
}
else {
Revst= Revst+Str.charAt(i-1);
recReverse(i-1);
}
}
public void check() {
System.out.println("Original string : "+ Str);
System.out.println("Reversed string : "+ Revst);
if (Str.equals(Revst))
System.out.println("String" + Str +" is a palindrome.");
else
System.out.println("String" + Str +" is not a palindrome.");
}
}

