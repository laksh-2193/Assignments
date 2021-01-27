        
        /**
         * Program to make a pyramid like this:
         *    1
         *   2 2
         *  3 3 3
         * 4 4 4 4
         * 
         */
        public class Ques_4
        {
            public static void main(String args[])
            {
                int c = 0,i=0,j=0;
                
                for(i=1;i<=4;i++)
                {
                   for(j=1;j<=(4-i);j++)
                    {
                        if(i!=4)
                        System.out.print(" ");
                    }
                   for(c=1;c<=i;c++)
                    {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        }
        