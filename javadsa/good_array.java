import java.util.*;
class good_array
{
    static int  gcd(int a,int b)
    {
        int [] c=new int[2];
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        if(gcd+1==2)
        return 1;
        else 
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int [n];
        int []m=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int b=0,c=0,d=0,result=0;
        for(int i=0;i<n-1;i++)
        for(int j=1;j<n;j++)
            if(gcd(a[i],a[j])==1)
            {
            result=1;
            }
          if(result ==1)
          System.out.println("Good array");
          else
          System.out.println("Not a Good Array");
}
}