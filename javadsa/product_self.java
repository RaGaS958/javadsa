import java.util.*;
class product_self
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        int [] b=new int[n];    
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int pro=1;
        for(int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        pro=pro*a[j];
        for(int k=i-1;k>0;k--)
        pro=pro*a[k];
        b[i]=pro;
        pro=1;
        }
         System.out.println(Arrays.toString(b));      
        }
    } 