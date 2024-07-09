import java.util.*;
class spiral_matrix_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); 
        int c=0;
        System.out.print("Enter the size of matrix(size<5)=");
        int n=sc.nextInt();
        int [][] a=new int[n][n];
        int [] num=new int[1000];
        for(int i=0;i<n*n;i++)
        num [i]=i+1;
        for(int i=0;i<n;i++)//correct
        {
        for(int j=0;j<n;j++)
        {
        if(i+j+1==num[c] && i<=j )
        {
        a[i][j]=num[c];
        c++;
       } 
      }
    }
    for(int i=n-2;i>0;i--)//correct
    {
        a[n-1][i]=num[c];
        c++;
    }

    for(int i=n-1;i>0;i--)//corect
    {
        a[i][0]=num[c];
        c++;
    }
     for(int i=1;i<n-1;i++)
    {
        a[1][i]=num[c];
        c++;
    }
    if(n>3)
     for(int i=n-2;i>0;i--)
    {
        a[n-2][i]=num[c];
        c++;
    }   
   System.out.println("Final matrix:-");
   for(int f=0;f<n;f++)
   {
       for(int g=0;g<n;g++)
       {
           System.out.print(a[f][g]+" ");
        }
        System.out.println();
    }
}
}

