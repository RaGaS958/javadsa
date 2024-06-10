import java.util.*;
class tribonacci_series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range of series");
        int n=sc.nextInt();
        System.out.println();
        int n1=0,n2=1,n3=1,n4=0;
        System.out.print(n1+" "+n2+" "+n3);
        for(int i=0;i<n;i++)
        {
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
            System.out.print(" "+n4);
        }
        System.out.println();
    }
}