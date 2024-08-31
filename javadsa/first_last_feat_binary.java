import java.util.*;
class first_last_feat_binary
{
    static int binary(int target,int a[])
    {
        int start=0,end=a.length-1,mid=0;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]>target)
            end=mid-1;
            else if(a[mid]<target)
            start=mid+1;
            else if(target==a[mid])
            return mid;
        }
        return -1;
    }
    static int start(int a[],int target)
    {
        int start=0;
        int end=target;
        int mid=0;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]<a[target])
            start=mid+1;
            if(a[mid]==a[target])
            end=mid-1;
        }
        return start+1;
    }
     static int end(int a[],int target)
    {
        int start=target;
        int end=a.length-1;
        int mid=0;
        while(start<end)
        {
            mid=start+((end-start)/2);
            if(a[mid]>a[target])
            end=mid-1;
            if(a[mid]==a[target])
            start=mid+1;
        }
        return end+1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements in array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the target:-");
        int target=sc.nextInt();
        if(binary(target,a)==-1)
        System.out.println("Target not found");
        else
        {
            System.out.println("First occurence="+ start(a,binary(target,a)));
            System.out.println("Last occurence="+ end(a,binary(target,a)));
            
        }
        
    }
}