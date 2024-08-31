import java.util.*;
class greater_equal_size
{
    static int finder(int [] a)
    {
        int count=0;
        for(int x=0;x<a.length+1;x++)
        {
        for(int i=0;i<a.length;i++)
        if(a[i]>=x)
        count++;
        if(count==x)
        return x;
        else
        count=0;
        }
        return -1;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array= ");
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        if(finder(a) ==-1)
        System.out.println("Not found");
        System.out.println("Output= "+finder(a));
    }
}