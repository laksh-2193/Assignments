import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Day_Calculation
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println("Enter the older date seprated by spaces(' ')");
        String dateBeforeString = in.nextLine().trim();
        System.out.println("Enter the newer date seprated by spaces(' ')");
        String dateAfterString = in.nextLine().trim();
        try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
               
	       System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       System.out.println("Error occured!");
	 }
        
    }
    
}