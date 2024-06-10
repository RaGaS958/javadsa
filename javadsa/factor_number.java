import java.util.*;
class factor_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.println("Factors are:-");
        for(int i =1;i<=n;i++)
        if(n%i==0)
        System.out.print(i+" ");
        System.out.println();
    }
}