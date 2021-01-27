
/**
 *WAP to input a six digit from user and get the exact date of it.
 *
 *111219
 *Output : 11 December 2019
 */
public class Date_
{
    public static void main(int dt)
    {
        Date_ inv = new Date_();
        String format = Integer.toString(dt);
        String mnths[] = {"INVALID INPUT","January","February","March",
            "April","May","June","July","August","September","October","November"
            ,"December"};
         int no_of_days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(format.length()==6)
        {
            String exdat = format.substring(0,2);
            String month = format.substring(2,4);
            String year = format.substring(4,6);
            
            int l = Integer.parseInt(month);
            if((l<=12)&&(l>0))
            {
                if(Integer.parseInt(year)%4==0)
                {
                    if((l==2)&&(Integer.parseInt(exdat)>29))
                    {
                        inv.invalid_print();
                        
                    }
                    else
                    {
                        System.out.println(exdat+" "+mnths[l]+" 20"+year);
                    }
                    
                }
                
                else
                System.out.println(exdat+" "+mnths[l]+" 20"+year);
            }
        }
        else
        {
            inv.invalid_print();
          
        }
    }
    public void invalid_print()
    {
        System.out.println("INVALID DATE");
    }
}