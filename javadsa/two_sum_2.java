import java.util.*;
class two_sum_2
{
    static int range(int [] a,int target)
    {
        int start=0;
        int end=a.length-1;
        if(target<0)
        target=target*-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(a[mid]==target)
            return mid-1;
            else if(a[mid]>target)
            end=mid-1;
            else if(a[mid]<target)
            start=mid+1;
            else if(start==end && a[mid]!=target)
            return mid;
        }
        return end;
    }
    static int sum(int a[],int target,int pos,boolean b)
    {
        for(int i=0;i<pos;i++)
        for(int j=i+1;j<=pos;j++)
        if((a[i]+a[j])==target)
        {
            if(b)
        return i;
        else
        return j;
        }
        return -11111;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in ascending order:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the target sum:-");
        int target=sc.nextInt();
        int i=sum(a,target,range(a,target),true);
        int j=sum(a,target,range(a,target),false);
        if(i==-11111)
        System.out.println("Target not found");
        else
        System.out.println("Target found at "+i+" , "+j);
    }
}