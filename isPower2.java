public class isPower2 {
    public static boolean Method(int n)
    {
        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        int num1=14;
        System.out.println("is "+num1+" power of 2: "+Method(num1));
        int num2=32;
        System.out.println("is "+num2+" power of 2: "+Method(num2));
    }
    /*
     OUTPUT:-
     is 14 power of 2: false
     is 32 power of 2: true
     */
}
