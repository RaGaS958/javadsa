import java.util.*;
class max_value_of_eq
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of points=");
        int n=sc.nextInt();
        System.out.println("Enter the points:-");
        int [][] a=new int[n][2];
        for(int i=0;i<n;i++)
        for(int j=0;j<2;j++)
        a[i][j]=sc.nextInt();
        System.out.print("Enter the k=");
        int k=sc.nextInt();
        int t=0;int max=0,val=0;int c=0;
        int [] pos=new int[n-1];
    for(int i=0;i<n-1;i++)
     {
            t=Math.abs(a[i][0]-a[i+1][0]);
            if(t<=k)
            pos[c++]=i;
        }
        for(int i=0;i<c;i++)
        {
        val=a[pos[i]][1]+a[pos[i]+1][1]+Math.abs(a[pos[i]][0]-a[pos[i]+1][0]);
        if(val>max)
        max=val;
    }
    System.out.println("Max value of equation="+max);
}
}