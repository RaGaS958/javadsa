import java.util.*;
class spiral_matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.print("Enter the numbers of column(>=3)=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int [][] a =new int[3][n];
        for(int i=0;i<3;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        int l=n*3;
        int [] b=new int[l];
        for(int j=0;j<n;j++)
        {
        b[j]=a[0][j];
        b[j+n+1]=a[2][n-1-j];
        if(j==n-1)
        b[j+1]=a[1][j];
        }
       for(int i=n-1;i>0;i--)
       b[l-i]=a[1][n-i-1];
        System.out.println("Result="+Arrays.toString(b));
    }
}
        