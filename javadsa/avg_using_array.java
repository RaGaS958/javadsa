import java.util.*;
class avg_using_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       double sum=0,avg;
        System.out.print("Enter the number of elements=");
        int n=sc.nextInt();
        System.out.println();
        int [] a=new int[n];
        System.out.println("Enter the number:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        sum=sum+a[i];
        avg=sum/n;
        System.out.println("Average="+avg);
    }
}
