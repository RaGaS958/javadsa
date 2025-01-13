import java.util.*;
class right_interval
{
    static void interval(int a[][],int b[])
    {
        b[0]=-1;
        int k=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i][0]==a[i+1][1])
            b[k++]=i;
            else
            b[k++]=-1;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        int [][] a=new int[n][2];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<2;j++)
        a[i][j]=sc.nextInt();
        int count=n;
        int b[]=new int [n];
        if(n==1)
      b[0]=-1;
    else
     interval(a,b);
    System.out.println("Output="+Arrays.toString(b));
    }
}