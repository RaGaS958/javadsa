import java.util.*;
class selection_sorting
{
    static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int max(int arr[],int start,int end)
    {
        int max=arr[0];
        int indx=0;
        for(int i=start;i<=end;i++)
        if(max<arr[i])
        {
        max=arr[i];
        indx=i;
        }
        return indx;
    }
    static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int last=arr.length-1-i;
            int max=max(arr,0,last);
            swap(arr,max,last);
        }
        }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        selection(arr);
        System.out.println("sorted array:-"+Arrays.toString(arr));
        
    }
}