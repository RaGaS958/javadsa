import java.util.*;
class linear_search_2d
{
    static boolean check(int a[][],int target)
    {
        for(int i=0;i<a.length;i++)
        for(int j=0;j<a[i].length;j++)
        if(a[i][j]==target)
        return true;
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int[n][m];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.print("Enter the target:-");
        int target=sc.nextInt();
        if(check(a,target))
        System.out.println("target found");
        else
        System.out.println("target not found");
    }
}