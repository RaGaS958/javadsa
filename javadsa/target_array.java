import java.util.*;
class target_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int [] b=new int[n];
        System.out.println("Enter the indexes:-");
        int index;
        for(int i=0;i<n;i++)
         b[i]=sc.nextInt();
         int [] c=new int[1000];
         for(int i=0;i<n;i++)
         {
             if(c[b[i]]==0)
             c[b[i]]=a[i];
             else
             {
                 for(int j=0;j<n-b[i];j++)
                 {
                     temp=c[n-b[i]-1-j];
                     c[n-b[i]-1-j]=c[n-b[i]-j];
                     c[n-b[i]-j]=temp;
                    }
                    c[b[i]]=a[i];
    }
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        System.out.print(c[i]+",");
        System.out.println("]");
    }
}