import java.util.Scanner;
public class Admission {
int Adno[];
public Admission(int size) {
Adno=new int[size];
}
  void fillArray() {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter elements for array in SORTED ORDER only");
 int size = Adno.length;
  for (int i = 0; i < size ; i++) {
     Adno[i] = sc.nextInt();
  }
 }
  int binSearch(int l,int u,int v){
   if (l > u) 
   return -1;
   else {
      int mid = (l + u) / 2;
     if (Adno[mid]==v) 
    return mid;
    else{ 
    if (v < Adno[mid])
    u=mid-1;
    else if (v > Adno[mid]) 
     l = mid +1;
   }
return binSearch(l, u, v);
}
}
}
