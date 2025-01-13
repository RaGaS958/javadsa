import java.util.*;
class min_abs_sum
{
    static int mindiff(int a[],int []b)
    {
        int min=0;
        int diff=0;
        int c=0;
        for(int i=0;i<a.length;i++)
        {
        diff=Math.abs(a[i]-b[i]);
        if(diff>min)
        {
        min=diff;
        c=i;
        }
        }
        return c;
    }
    static boolean equal(int a[],int []b)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        if(a[i]!=b[i])
        c++;
        if (c==0)
        return true;
        else
        return false;
    }
    static int abssum(int a[],int b[],boolean e,int c)
    {
        int min=1000000;
        int sum=0;
        int cc=0;
        if(e)
        {
            for(int i=0;i<a.length;i++)
            {
               a[c]=a[i];
               int diff=Math.abs(a[c]-b[c]);
               if(diff<min)
               {
               min=diff;
               cc=i;
              }
            }
            a[c]=a[cc];
            for(int i=0;i<a.length;i++)
            sum=sum+Math.abs(a[i]-b[i]);
        }     
        else
        {
              for(int i=0;i<a.length;i++)
            {
               b[c]=b[i];
               int diff=Math.abs(a[c]-b[c]);
               if(diff<min)
               {
               min=diff;
               cc=i;
              }
            }
            b[c]=b[cc];
            for(int i=0;i<a.length;i++)
            sum=sum+Math.abs(a[i]-b[i]);
        }
        return sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of both array= ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter the elements in first array:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the elements in Second array:-");
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        if (equal(a,b))
        System.out.println("Absolute minimum sum= 0 ");
        else
        {
        int x=abssum(a,b,true,mindiff(a,b));
        int y=abssum(a,b,false,mindiff(a,b));
        if(x>y)
        System.out.println("Min absolute sum="+x);
        else
        System.out.println("Min absolute sum= "+y);
        }
    }
}