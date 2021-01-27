class Stock
{
String item; double qty,rate,amt;
Stock(String a, double b, double c)
{
item=a;
qty=b;
rate=c;
amt=qty * rate;
}
void display()
{
System.out.println("Name of the item: "+item);
System.out.println("Quantity: "+qty);
System.out.println("Rate per unit: "+rate);
System.out.println("Net value: "+amt);
}
}
class Purchase extends Stock
{
int pqty;
double prate;
Purchase(String a, double b, double c, int d, double e)
{
super(a, b, c);
pqty=d;
prate=e;
}
void update()
{
qty += pqty;
if(prate!=rate)
rate=prate;
amt = qty * rate;
}
void display()
{
super.display();
update();
super.display();
}
}