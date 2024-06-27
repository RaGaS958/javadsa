import java.util.*;
class sum_and_sub_of_2d_matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
             System.out.println("Enter the size of matrix (row X column):-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        int [][] b=new int[n][m];
        System.out.println("Enter the elements of first matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
         System.out.println("Enter the elements of second matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
         b[i][j]=sc.nextInt();
       for(int i=0;i<n;i++)
       for(int j=0;j<m;j++)
       a[i][j]=a[i][j]+b[i][j];
       System.out.println("sum of matrix:-");
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
        System.out.print(a[i][j]);
        }
        System.out.println();
        }
      for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
      a[i][j]=(a[i][j]-b[i][j])-b[i][j];
      System.out.println("Subtraction of matrix:-");
       for(int i=0;i<n;i++)
       {
      for(int j=0;j<m;j++)
      {
          System.out.print(a[i][j]);
        }
        System.out.println();
    }
  }
}