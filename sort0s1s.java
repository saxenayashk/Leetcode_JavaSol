public class sort0s1s {
    public static void Method(int arr[],int n)
    {
        int low=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;

                low++;
            }
        }

        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={1,0,1,1,0,0,1};
       int n=arr.length;  
       Method(arr, n);      
    }
    /*
     OUTPUT:-
     1 1 1 1 0 0 0 
     */
}
