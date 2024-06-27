import java.util.*;
class basic_2d_matrix_input_output
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix (row X column):-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements of matrix:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Entered matrix:-");
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