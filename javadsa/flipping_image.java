import java.util.*;
class flipping_image
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix (row X column):-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements of matrix(0,1 only):-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Original matrix:-");
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
          {
          if(a[i][j]==0)
          a[i][j]=1;
          else
          a[i][j]=0;
          }
          System.out.println("flipped image matrix:-");
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
          