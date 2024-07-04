import java.util.*;
class array_integer_add
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c=0,r,n1=0,n2;
        System.out.print("Enter size of array=");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number in array:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("first number in array form:-"+Arrays.toString(a));
        System.out.print("Enter the Second number in normal form=");
        int b=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++)
        n1=(n1*10)+a[i];
        n1=n1+b;
        n2=n1;
        while(n2>0)
        {
            n2=n2/10;
            c++;
        }
        int [] nn=new int[c];
        for(int i=1;i<=c;i++)
        {
        nn[c-i]=n1%10;
        n1=n1/10;
    }
        System.out.println("Final result after addition="+Arrays.toString(nn));

    }
}