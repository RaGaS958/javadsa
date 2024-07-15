import java.util.*;
class matrix_multiplication
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix 1:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the size of matrix 2:-");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int [][] a=new int[n][m];
        int [][] b=new int[n1][m1];
        int [][] c=new int[m][n1];
        System.out.println("Enter the elements in Matrix 1:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Enter the elements of Matrix 2:-");
        for(int i=0;i<n1;i++)
        for(int j=0;j<m1;j++)
        b[i][j]=sc.nextInt();
         System.out.println(" Matrix 1:-");
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
       System.out.println(" Matrix 2:-");
     for(int i=0;i<n1;i++)
        {
        for(int j=0;j<m1;j++)
        {
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }
    int sum=0; 
    for(int i=0;i<n;i++)
    {
    for(int j=0;j<m1;j++)
    {
      for(int k=0;k<m;k++)
      {
    sum=sum+(a[i][k]*b[k][j]);
      }
      c[i][j]=sum;
      sum=0;
    }
}
    System.out.println("Multiplied Matrix:-");
     for(int i=0;i<n;i++)
        {
        for(int j=0;j<m1;j++)
        {
            System.out.print(c[i][j]+" ");
        }
            System.out.println();
    }
}
}