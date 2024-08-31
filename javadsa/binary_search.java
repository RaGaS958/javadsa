import java.util.*;
class binary_search
{
    static boolean check(int a[],int target)
    {
        int mid =0;
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]<target)
            start=mid+1;
             if(a[mid]>target)
            end=mid-1;
             if(target==a[mid])
            return true;
        }
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements in ascending order:-");
        int [] a=new int[n];
     for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      System.out.print("Enter the target=");
     int target=sc.nextInt();
      if(check(a,target))
      System.out.println("target found");
      else
       System.out.println("Target not found");
    }
}   