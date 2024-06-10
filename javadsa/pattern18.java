import java.util.*;
class pattern18
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<n-i+1;j++)
        {
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
        System.out.print(k);
    }
  System.out.println();
    }
}
}