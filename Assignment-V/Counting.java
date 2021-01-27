import java.util.Scanner;
/**
  *Write a program to accept a sentence which may be terminated by either '.' or '?' only. The words are to be
    separated by a single blank space. Print an error message if the input does not terminate with '.' or '?'. You can
    assume that no word in the sentence exceeds 15 characters, so that you get a proper formatted output. Perform
    the following tasks:
    (i) Convert the first letter of each word to uppercase.
    (ii) Find the number of vowels and consonants in each word and display them with proper headings
    along with the words. 
 */
public class Counting
{
public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String str = in.nextLine();
      int len = str.length();
      str=" "+str+" ";
      
      str = str.toLowerCase();
      int sp = 0;
      int vow = 0,cnst = 0;
      char inp = ' ';
      char validsenc =str.charAt(len);
      String validsen = ""+validsenc;
      
      if((validsen.equals("."))||(validsen.equals("?")))
      {
      
          for(int i = 1;i<str.length();i++)
          {
                  inp = str.charAt(i);
                  if(inp==' ')
                  {
                          for(int j = sp;j<i;j++)
                          {
                              if((str.charAt(j)=='a')||(str.charAt(j)=='e')||(str.charAt(j)=='i')||(str.charAt(j)=='o')||(str.charAt(j)=='u'))
                              {
                                  vow++;
                                }
                                else
                                {
                                    cnst++;
                                }
                               
                            
                        }
                            
                            if((str.substring(sp,i)).equalsIgnoreCase(" "))
                            {
                            
                        }
                        else
                        {
                            System.out.println("Word : "+str.substring(sp,i));
                            System.out.println("Vowels : "+vow+"\nConstants :"+(cnst-1));
                            System.out.println("-----------------------------------------------");
                            
                        }
                            sp = i;
                            vow=0;
                            cnst=0;
                            
                    }
                }
        }
        else
        {
            System.out.println("Invalid Sentence");
        }
    }
}
   