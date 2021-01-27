        
        /**
         * Program to make a pyramid like this:
         *     1
         *    1 1
         *   1 2 1
         *  1 3 3 1
         * 1 4 6 4 1
         * 
         */
        import java.util.Scanner;
        
        public class Ques_6
        {
            public static void main(String args[])
            {
                int c = 0,i=0,j=0,el=0,a=0,s=0;
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                int z = 0;
                for(i=1;i<=num;i++)
                {
                   for(j=1;j<=(num-i);j++)
                    {
                        
                            System.out.print(" ");
                        }
                    
                   for(c=1;c<=i;c++)
                    {
                        System.out.print(c+" ");
                                               
                    }
                    System.out.println();
                }
                }
            }
        
        