import java.util.*;
class Smaller_then_input
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the number for checking smaller then it");
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
        if(s>a[i])
        count++;
        System.out.println("Number of elements smaller than "+s+" are "+count);
    }
}
        