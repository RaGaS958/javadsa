import java.util.*;
class infinite_array_search
{
    static int binary(int a[],int start,int end,int target)
    {
        int mid=0;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]>target)
            end=mid-1;
            else if(a[mid]<target)
            start=mid+1;
            else if(a[mid]==target)
            return mid;
        }
        return -1;
    }
    static int range(int a[],int target,boolean choice)
    {
        int start=0;
        int end=0;
        int k=1;
          while(a[end]<target) 
            {
                start=end;
                end=end+k;
                k=k*2;
            }
            if(choice)
            return start;
            return end;
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
        int r=binary(a,range(a,target,true),range(a,target,false),target)+1;
        if(r>=0)
        {
            System.out.println("Target found at "+r);
        }
        else
        System.out.println("Not found");
    }
    }