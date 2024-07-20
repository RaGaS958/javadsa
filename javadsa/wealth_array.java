import java.util.*;
class wealth_array
{
    static int max(int a[][])
    {
        int max=0;int sum=0;
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a[i].length;j++)
        sum=sum+a[i][j];
        if(max<sum)
        max=sum;
        sum=0;
        }
        return max;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int [n][m];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Maximum wealth:-"+max(a));
    }
}