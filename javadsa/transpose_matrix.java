import java.util.*;
class transpose_matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matix:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        int [][] b=new int[m][n];
        System.out.println("Enter the elements of matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
         for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         b[j][i]=a[i][j];
         System.out.println("Original matrix:-");
                for(int i=0;i<n;i++)
          {
        for(int j=0;j<m;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
    System.out.println("Tranposed matrix:-");
          for(int i=0;i<m;i++)
          {
        for(int j=0;j<n;j++)
        {
            System.out.print(b[i][j]);
        }
        System.out.println();
    }
  }
}