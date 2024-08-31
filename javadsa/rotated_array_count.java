import java.util.*;
class rotated_array_count
{
    static int counter(int a[])
    {
        int start=0;
        int end=a.length-1;
        int k=0;
        while(a[start]>a[end])
        {   int  temp=a[start];
            for(int i=0;i<end-1;i++)
            {
              a[i]=a[i+1];
            }
            a[end]=temp;
            k++;
        }
        return k;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter the elements:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Number of rotations= "+counter(a));
    }
}
