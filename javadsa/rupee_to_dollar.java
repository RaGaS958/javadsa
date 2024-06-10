import java.util.*;
class rupee_to_dollar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount=");
        double r=sc.nextDouble();
        System.out.println();
        double d=r*(0.012);
        System.out.println("Amount in dollars="+d);
    }
}