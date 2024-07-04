import java.util.*;
class rotation_equals_target
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,flag=0;
        System.out.print("Enter the size of matrix=");
        int n=sc.nextInt();
        int [][] a=new int[n][n];
        int [][] b=new int[n][n];
        System.out.println("Enter the elements of matrix:-");
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
          for(i=0;i<n;i++)
          for(j=0;j<n;j++)
          b[n-i-1][j]=a[i][j];
          System.out.println("Enter the elements of target matrix:-");
            for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(a[i][j]!=b[i][j])
                flag++;
            }
            if(flag>0)
            System.out.println("After rotation target matrix is not obtaining");
            else
            System.out.println("Target matrix obtained by rotating ");
        }
    }