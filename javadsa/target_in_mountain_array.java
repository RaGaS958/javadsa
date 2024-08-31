import java.util.*;
class target_in_mountain_array
{
    static int searchpeak(int a[])
    {
        int start=0;
        int end=a.length-1;
        int mid=0;
        while(start!=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]<a[mid+1])
            start=mid+1;
            else if(a[mid] > a[mid+1])
            end=mid;
        }
        return start;
    }
static boolean check(int a[],int target,int m)
    {
        int mid =0;
        int start=0;
        int end=m;
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
        static boolean check1(int a[],int target,int m)
    {
        int mid =0;
        int start=m+1;
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
        System.out.println("Enter the elements in array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the target:-");
        int target=sc.nextInt();
        if(check(a,target,searchpeak(a)))
        System.out.println("Target found");
        else if(check1(a,target,searchpeak(a)))
         System.out.println("Target found");
         else
         System.out.println("Not found");
    }
}