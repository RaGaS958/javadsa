import java.util.*;
class spiral_matrix_3
{
    static int right(int [][]a,int le,int lo,int u,int ri,int var )
    {   
        for(int i=le;i<ri;i++)
        {
        a[u][i]=var++;
        }
        return var;
    }
    static int down(int [][]a,int le,int lo,int u,int ri,int var )
    {
        for(int i=u+1;i<lo;i++)
        {
        a[i][ri-1]=var++;
        }
         return var;
    }
    static int left(int [][]a,int le,int lo,int u,int ri,int var )
    {
        for(int i=ri-2;i>=le;i--)
        {
        a[lo-1][i]=var++;
        }
        return var;
    }
    static int up(int [][]a,int le,int lo,int u,int ri, int var )
    {
        for(int i=lo-2;i>u;i--)
        {
        a[i][le]=var++;
        }
        return var;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int var=1;
        System.out.println("Enter the Matrix's size:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the starting row and column:-");
        int riii=sc.nextInt();
        int ci=sc.nextInt();
        int u=0,lo=n,le=0,ri=m;
        int ui=riii-1,loi=riii,lei=ci-1,rii=ci;
        int t=1;
        int k=0;
        int d=0,b=0,c=0;
        while(t<=n)
        {
            d=right(a,lei-k,loi+k,ui-k,rii+k,var);
            b=down(a,lei-k,loi+k,ui-k,rii+k,d);
            c=left(a,lei-k,loi+k,ui-k,rii+k,b);
            var=up(a,lei-k,loi+k,ui-k,rii+k,c);
            k++;
            t++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}