import java.util.*;
class find_missing_positives
{
    static void swap(int arr[],int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {   if(arr[i]>0 && arr[i]<arr.length)
            if(arr[i]!=arr[arr[i]-1])
            swap(arr,i,arr[i]-1);
        }
    }
    static void missing_positive(int arr[])
    {
        System.out.print("[");
        boolean t=true;
        for(int i=0;i<arr.length;i++)
        {
            if( arr[i]!=i+1)
            {
                System.out.print((i+1)+" ");
                t=false;
            }
        }
        if(t)
        {
            System.out.print(arr.length+1);
        }
        System.out.println("]");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the values in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        sort(arr);
        System.out.println(Arrays.toString(arr));
        missing_positive(arr);
    }
}