import java.util.*;
class lucky_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int max=0;int min=10000;int pos=0;
        System.out.println("Enter the size of matrix=");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements of matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
        if(a[i][j]<min)
        {
        min=a[i][j];
        pos=j;
        }
        }
        for(int k=0;k<n;k++)
        if(a[k][pos]>max)
        {
            max=a[k][pos];
        }
        if(min==max)
        {
            break;
        }
        else
        {
            max=0;min=10000;
        }
    }
    System.out.println("Lucky number="+max);
}
}