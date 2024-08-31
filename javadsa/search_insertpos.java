import java.util.*;
class search_insertpos
{
    static int  search(int a[],int target)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==a[mid])
            return mid;
            if(target<a[mid])
            end=mid-1;
            if(target>a[mid])
            start=mid+1;
        
        }
        return end+1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int [] a=new int[n];
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the target:-");
        int target=sc.nextInt();
        System.out.println("Position= "+search(a,target));
    }
}
    