import java.util.*;
class ceiling_array_searching
{
    static int check(int a[],int target)
    {
        int start=0;
        int end=a.length-1;
         int mid =0;
        while(start<=end)
        {
         mid=start+((end-start)/2);
        if(target>a[mid])
        start=mid+1;
        else if(target<a[mid])
        end=mid-1;
        else if(target==a[mid])
        return mid;
    }
    return start;
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        System.out.println("Enter the elements in ascending order:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the target=");
        int target=sc.nextInt();
       if(target<=a[n-1])
       System.out.println("ceiling will be "+a[check(a,target)]);
       else
       System.out.println("No ceiling");
    }
}