import java.util.*;
class cells_increment_and_odd_values
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix(row X colums):-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println();
        int [][] a=new int[n][m];
        int [][] b=new int[2][2];
        System.out.println("Enter the four indices(2 each for rows and columns)(Where row index should less then "+n+" and column index less then "+m+" :-" );
        for(int i=0;i<2;i++)
        for(int j=0;j<2;j++)
        b[i][j]=sc.nextInt();
         for(int i=0;i<2;i++)
         for(int j=0;j<m;j++)
         a[b[i][0]][j]=a[b[i][0]][j]+1;
         for(int i=0;i<2;i++)
         for(int j=0;j<n;j++)
         a[j][b[i][1]]= a[j][b[i][1]]+1;
         System.out.println("Matrix after processing:-");
          for(int i=0;i<n;i++)
          {
        for(int j=0;j<m;j++)
        {
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
    int count=0;
    for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
    if(a[i][j]%2!=0)
    count++;
    System.out.println("Number of odd cells are="+count);
}
}