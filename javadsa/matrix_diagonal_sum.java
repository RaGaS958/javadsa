import java.util.*;
class matrix_diagonal_sum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of matrix=");
        int n=sc.nextInt();
        System.out.println();
        int [][] a=new int[n][n];
        System.out.println("Enter the elements of matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        int sum=0;
        for(int j=0;j<n;j++)
        sum=sum+a[j][j];
        System.out.println("Original matrix:-");
         for(int i=0;i<n;i++)
         {
        for(int j=0;j<n;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
    System.out.println("Sum of diagonal="+sum);
  }
}