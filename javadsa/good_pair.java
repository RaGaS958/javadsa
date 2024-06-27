import java.util.*;
class good_pair
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int temp=0,count=0;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        temp=a[i];
        for(int j=i+1;j<n;j++)
        {
        if(temp==a[j])
        count++;
      }
    }
       System.out.println("Number of Good pairs are "+count);
   }
}