import java.util.*;
class out_ranged_binary_search
{
    static boolean check(int a[],int target)
    {
        int mid =0;
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(mid<target)
            start=mid+1;
            else if(mid>target)
            end=mid-1;
            else if(target==mid)
            return true;
        }
        return false;
    }
        static boolean check1(int a[],int target)
    {
        int mid =0;
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(mid<target)
            end=mid-1;
            else if(mid>target)
            start=mid+1;
            else if(target==mid)
            return true;
        }
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int [] a=new int[n];
     for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      System.out.print("Enter the target=");
     int target=sc.nextInt();
     boolean test;
     if(a[0]>a[n-1])
     test=check1(a,target);
     else
     test=check(a,target);
      if(test)
      System.out.println("target found");
      else
       System.out.println("Target not found");
    }
}   