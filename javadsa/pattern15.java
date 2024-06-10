import java.util.*;
class pattern15
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.println();
        for(int i=n;i>=0;i--)
        {
        for(int j=1;j<=i;j++)
        {
        System.out.print(n-i+1);
    }
  System.out.println();
    }
}
}