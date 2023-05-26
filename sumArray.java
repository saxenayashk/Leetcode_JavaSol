public class sumArray {
    public static int Method(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res+arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,-2,8,-1,3};
        int n=arr.length;

        System.out.println("Sum of all elements in the array is: "+Method(arr, n));

        /*
         OUTPUT:-
         Sum of all elements in the array is: 13
         */
    }
}
