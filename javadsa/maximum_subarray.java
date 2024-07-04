import java.util.*;
class maximum_subarray
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int max_sum=0;int current_sum=0;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        int c=0;
        System.out.println("Enter the elements of array:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        max_sum=a[0];
        current_sum=a[0];
        for(int i=1;i<n;i++)
        {
            current_sum=current_sum+a[i];
            if(current_sum>max_sum)
            {
            max_sum=current_sum;
        }
            else if (current_sum<0)
            current_sum=0;
        }
        int [] d=new int[c];
        for(int i=0;i<c;i++)
        d[i]=a[b[i]];
        System.out.println("Sum="+max_sum);//recheckable
    }
}
        