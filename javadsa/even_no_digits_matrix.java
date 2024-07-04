import java.util.*;
class even_no_digits_matrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,count=0,c=0,r=0;
        System.out.println("Enter the size of matrix:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the elements of matrix:-");
        int [][] a=new int[n][m];
        for(i=0;i<n;i++)
        for(j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        for(i=0;i<n;i++)
        {
        for(j=0;j<m;j++)
        {
            r=a[i][j];
            while(r>0)
            {
                r=r/10;
                count++;
            }
            if(count%2==0)
            c++;
            count=0;
        }
    }
    System.out.println("Original matrix:-");
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
         {
           System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("Numbers with even number of digits are "+c);
   }
}