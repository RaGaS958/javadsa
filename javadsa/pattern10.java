import java.util.*;         
class pattern10
{
    public static void main()
    {       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++)
        {
        System.out.print(n-j+1);
    }
  System.out.println();
    }
}
}