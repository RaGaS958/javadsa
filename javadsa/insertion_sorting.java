import java.util.*;
class insertion_sorting
{
    static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void insertion(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                swap(arr,j,j-1);
                else
                break;
            }
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
        insertion(arr);
        System.out.println("sorted array:-"+Arrays.toString(arr));
    }
}