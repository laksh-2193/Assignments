import java.util.Scanner;
import java.util.Calendar;
public class Day
{
    int year, month, day;
    Day(){
        Calendar cal = Calendar.getInstance();
        day = cal.get(Calendar.DATE);
        month = cal.get(Calendar.MONTH)+1;
        year = cal.get(Calendar.YEAR);
    
    }
    
    Day(int y,int m,int d){
        year = y;
        month = m;
        day = d;
    }
    
    int getYear(){
        return year;
    }
}
