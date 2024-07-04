import java.util.*;
class reshape_matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ct=0;
         System.out.println("Enter the size of matrix:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements of matrix:-");
         for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         a[i][j]=sc.nextInt();
         System.out.println("Enter the dimensions to which original matrix will be reshaped:-");
         int r=sc.nextInt();
         int c=sc.nextInt();
         int [][] b=new int[r][c];
         int [] d=new int[n*m];
          for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         {    
         d[ct]=a[i][j];
         ct++;
        }
         ct=0;
         for(int i=0;i<r;i++)
         for(int j=0;j<c;j++)
         {
         b[i][j]=d[ct];
         ct++;
        }
         System.out.println("Original matrix:-");
         for(int i=0;i<n;i++)
         {
         for(int j=0;j<m;j++)
         {
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Reshaped matrix:-");
               for(int i=0;i<r;i++)
         {
         for(int j=0;j<c;j++)
         {
            System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
         