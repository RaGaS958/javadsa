import java.util.*;
class rotated_arraydup_target
{
    static int findpivot(int a[])
    {
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(mid<end && a[mid]>a[mid+1])
            return mid;
            if(mid>start && a[mid]<a[mid-1])
            return mid-1;
            if(start==end)
            {
                start=start-1;
                end=end-1;
            }
            if(a[mid]<=a[start])
            end=mid-1;
            if(mid<end && a[mid+1]>a[mid])
            start=mid+1;
        }
        return -1;
    }
       static boolean check(int a[],int target,int start ,int end)
    {
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(a[mid]<target)
            start=mid+1;
             else if(a[mid]>target)
            end=mid-1;
            else if(target==a[mid])
            return true;
            else if(start==end && a[mid]!=target)
            return false;
        }
        return false;
    }
    static boolean checker(int a[],int target,int s)
    {
     if(target >a[a.length-1])
    if(check(a,target,0,s-1))
    return true;
     if(target==a[s])
    return true;
     if(check(a,target,s+1,a.length-1))
     return true; 
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
    System.out.print("Enter the target:-");
    int target=sc.nextInt();
    if(checker(a,target,findpivot(a)))
    System.out.println("Target found");
    else
    System.out.println("Target not found");

}
}

   