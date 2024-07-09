import java.util.*;
class spiral_matrix_2_2
{
    static void right(String [][]a,int le,int lo,int u,int ri)
    {
        for(int i=le;i<ri;i++)
        a[u][i]=">";
    }
    static void down(String [][]a,int le,int lo,int u,int ri)
    {
        for(int i=u+1;i<lo;i++)
        a[i][ri-1]="v";
    }
    static void left(String [][]a,int le,int lo,int u,int ri)
    {
        for(int i=ri-2;i>=le;i--)
        a[lo-1][i]="<";
    }
    static void up(String [][]a,int le,int lo,int u,int ri)
    {
        for(int i=lo-2;i>u;i--)
        a[i][le]="^";
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Matrix's size=");
        int n=sc.nextInt();
        String [][] a=new String[n][n];
        System.out.println();
        int u=0,lo=n,le=0,ri=n;
        int t=1;
        int k=0;
        while(t<=n)
        {
            right(a,le+k,lo-k,u+k,ri-k);
            down(a,le+k,lo-k,u+k,ri-k);
            left(a,le+k,lo-k,u+k,ri-k);
            up(a,le+k,lo-k,u+k,ri-k);
            k++;
            t++;
        }
        System.out.println("Spiral matrix");
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