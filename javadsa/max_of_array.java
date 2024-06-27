import java.util.*;
class max_of_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int max=0;
        System.out.print("Enter the array size=");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
     for(int i=0;i<n;i++)
     if(max<a[i])
     max=a[i];
     System.out.println("Max element="+max);
    }
}