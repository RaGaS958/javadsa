import java.util.*;
class rotated_array_2
{
    static int search(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end])
        {
            return arr[start];
        }
        while(start!=end)
        {
         int mid=start+(end-start)/2;
         if(arr[mid]>=arr[end])
         start=mid+1;
         else if(arr[mid]<arr[end])
         end =mid;
        }
        return arr[start];
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Your array is "+Arrays.toString(arr));
        System.out.println("Minimum element is "+search(arr));
    }
}
    