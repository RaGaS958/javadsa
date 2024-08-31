import java.util.*;
class mountain_array
{
    static int search(int a[])
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
        return a[start];
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
        System.out.println("Peak of mountain="+search(a));
    }
}