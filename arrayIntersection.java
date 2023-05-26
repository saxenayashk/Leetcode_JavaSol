import java.util.Vector;

public class arrayIntersection {
    public static int Method(int arr[],int n,int brr[],int m)
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i]==brr[j])
                {
                   return arr[i];
                }
            }
        }
        return -1;
    }
    public static Vector<Integer> Efficient(int arr[],int n,int brr[],int m)
    {
        Vector<Integer> res=new Vector<>();

        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr[i]<brr[j])
            {
                i++;
            }
            else if(arr[i]==brr[j])
            {
                res.add(arr[i]);
                i++;
                j++;
            }
            else 
            {
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        int brr[]={3,4};
        int m=brr.length;

        System.out.println("Intersection element of these two arrays is: "+Method(arr, n, brr, m));
        System.out.println("Efficient Solution is: "+Efficient(arr, n, brr, m));
    }
    /*
     OUTPUT:-
     Intersection element of these two arrays is: 3
     Efficient Solution is: [3]
     */
}
