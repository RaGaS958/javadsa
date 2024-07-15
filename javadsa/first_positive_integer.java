import java.util.*;
class first_positive_integer
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int flag=0;
        int max=0;
        int found=0;
        for(int i=0;i<n;i++)
        if(a[i]>max)
        max=a[i];
        int [] b=new int[max+n];
        int c=0;
        for(int i=1;i<=max+1;i++)
        {
        for(int j=0;j<n;j++)
        {
        if(a[j]==i)
        {
        flag++;
       }
       }
        if(flag==0)
        {
        b[c++]=i;
        }
        flag=0;
      }
      System.out.println("Smallest positive integer missing="+b[0]);
}
}