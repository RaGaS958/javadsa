import java.util.*;
class number_of_comparisions
{
    static int  binarysearch(int arr[],int k)
    {
        int start=0;
        int end=arr.length-1;
        int counter=0;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            counter+=1;
            if (arr[mid]>k)
            end=mid-1;
             else if(arr[mid]<k)
            start=mid+1;
            else
            return counter;
            
        }
        return -1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Enter the target element=");
        int k=sc.nextInt();
        if(binarysearch(arr,k)==-1)
        System.out.println("Target not found");
        else
        System.out.println("number of comparisions="+binarysearch(arr,k));
    }
}
    