public class reverseInt
{
    public static int Method(int n)
    {
        int res=0;
        while(n>0)
        {
            int rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int num1=456;
        System.out.println("Reverse of "+num1+" is: "+Method(num1));
        int num2=130;
        System.out.println("Reverse of "+num2+" is: "+Method(num2));
    }
    /*
     OUTPUT:-
     Reverse of 456 is: 654
     Reverse of 130 is: 31
     */
}