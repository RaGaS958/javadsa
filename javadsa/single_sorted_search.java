import java.util.*;
class single_sorted_search
{
    static int search(int a[])
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
           if(a[end-1]==a[end])
           end=end-2;
           else if(a[start +1]==a[start])
           start=start+2;
           else if(start==end)
           return a[start];
        }
        return -1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n=sc.nextInt();
        System.out.println("Enter elements in array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Output="+search(a));
    }
}
    