import java.util.*;
class duplicate_num
{
   static int dup(int a[])
   {
       for(int i=0;i<a.length-1;i++)
       for(int j=i+1;j<a.length;j++)
       {
       if(a[i]-a[j]==0)
       return a[i];
       }
       return -1;
   }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of array= ");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
       System.out.println("Duplicate element="+dup(a));
    }
}