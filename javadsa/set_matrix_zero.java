import java.util.*;
class set_matrix_zero
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements in matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Original matrix:-");
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
        int [][] c=new int[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
            if(a[i][j]==0)
            c[i][j]=1;
        }
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        {
            if(c[i][j]==1)
            {
                for(int p=0;p<m;p++)
                a[i][p]=0;
                for(int q=0;q<m;q++)
                a[q][j]=0;
            }
        }
        System.out.println("Final matrix:-");
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}
     