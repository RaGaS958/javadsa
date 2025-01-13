import java.util.*;
class peal_element2
{
    static void peak(int a[][],int b[])
    {
        int c=0;
        for(int i=1;i<a.length-1;i++)
        for(int j=1;j<a[i].length-1;j++)
        {
            if(a[i][j]>=a[i][j-1] && a[i][j]>=a[i][j+1] && a[i][j]>=a[i-1][j] && a[i][j]>=a[i+1][j])
            {
            b[0]=i-1;
            b[1]=j-1;
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array= ");
        int n=sc.nextInt();
        int  [][]a=new int[n+2][n+2];
        System.out.println("Enter the elements in array:-");
       for(int i=0;i<a.length;i++)
        {
        a[0][i]=-1;
        a[a.length-1][i]=-1;
        a[i][0]=-1;
        a[i][a.length-1]=-1;
        }
        for(int i=1;i<a.length-1;i++)
        for(int j=1;j<a[i].length-1;j++)
        a[i][j]=sc.nextInt();
        int b[]=new int[2];
        peak(a,b);
        System.out.println("Peak element="+Arrays.toString(b));
        for(int i=0;i<n+2;i++)
        {
        for(int j=0;j<n+2;j++)
        {
            System.out.print(" "+a[i][j]+" ");
        }
        System.out.println();
    }
    }   
    }
        
    