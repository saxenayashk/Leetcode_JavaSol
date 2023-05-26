public class tripletSum {
    public static void Method(int arr[],int n,int sum)
    {
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if((arr[i]+arr[j]+arr[k])==sum)
                    {
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=12;
        
        Method(arr, n, k);
    }
    /* 
     OUTPUT:- (3,4,5)
     */
}
