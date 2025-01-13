import java.util.*;
class cyclic_sort
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
        {
         if(arr[i]!=i+1)
         {
             swap(arr,i,arr[i]-1);
            }
        }
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array=");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter elements in array:-");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    sort(arr);
    System.out.println("Sorted array:-"+Arrays.toString(arr));
}
}