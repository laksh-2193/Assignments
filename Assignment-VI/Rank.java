public class Rank extends Record
{
    int index;
    Rank(){
      super();
      index = 0;
    }
    void highest(){
        int max = rnk[0];
        index = 0;
        for(int i = 0;i<5;i++){
            if(max<rnk[i])
            {
                index = i;
            }
        }
    }
    void display(){
        super.display();
        System.out.println("Name of topper is "+names[index]);
    }
} 