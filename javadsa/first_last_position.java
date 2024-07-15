import java.util.*;
class first_last_position
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Target=");
        int t=sc.nextInt();
        System.out.println();
        int c=0;
        for(int i=0;i<n;i++)
        if(a[i]==t)
        c++;
        if(c==0)
        System.out.println("Target not found");
        else
        {
        int [] f=new int[c];
        c=0;
        for(int i=0;i<n;i++)
        if(a[i]==t)
        f[c++]=i+1;
        System.out.println("Target found at:-"+Arrays.toString(f));
    }
}
}