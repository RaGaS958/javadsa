import java.util.*;
class fibronicci_series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range of series=");
        int n=sc.nextInt();
        System.out.println();
        int n1=-1,n2=1,n3=0;
        for(int i=0;i<n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
        System.out.println();
    }
}