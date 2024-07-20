import java.util.*;
class linear_range_max_min
{
    static int max(int a[],int l,int u)
    {
        int m=0;
        for(int i=l-1;i<u;i++)
        if(a[i]>m)
        m=a[i];
        return m;
    }
        static int min(int a[],int l,int u)
    {
        int m=0;
        for(int i=l-1;i<u;i++)
        if(a[i]<m)
        m=a[i];
        return m;
    }
  public static void main()
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size:-");
      int n=sc.nextInt();
      int [] a=new int[n];
      System.out.println("Enter the elements:-");
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      System.out.println("Enter the upper and lower range:-");
      int u=sc.nextInt();
      int l=sc.nextInt();
      System.out.println("Max= "+max(a,l,u)+"\nMin="+min(a,l,u));
    }
}