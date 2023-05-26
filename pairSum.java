public class pairSum {

    public static void Method(int arr[],int n,int sum)
    {
        for(int k=0;k<n;k++)
        {
            for(int l=k+1;l<n;l++)
            {
                if((arr[k]+arr[l])==sum)
                {
                    System.out.println("("+arr[k]+","+arr[l]+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int sum=5;

        Method(arr, n, sum);

    }
    /*
     OUTPUT:-
      (1,4)
      (2,3)
     */
}
