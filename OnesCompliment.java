public class OnesCompliment {
    public static int Method(int n)
    {
        int mask=0;
        int x=n;

        // Edge Case
        if(n==0)
        {
            return 1;
        }

        while(x!=0)
        {
            mask=(mask<<1)| 1;
            x=x>>1;
        }

        int res=mask& (~n);

        return res;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("One's Compliement of "+num+" is: "+Method(num));
    }
    /*
     OUTPUT:-
     One's Compliement of 5 is: 2
     */
}
