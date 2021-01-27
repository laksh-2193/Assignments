class fib{
    public static void main(String[]args){
        int f=0,s=1,t,i;
        System.out.println(f);
        System.out.println(s);
        for(i=2;i<10;++i){
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}
