import java.util.*;
class power
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and power it is to be raised:-");
        double n=sc.nextDouble();
        double p=sc.nextDouble();
        double pow=1;
        for(int i=1;i<=p;i++)
        pow=pow*n;
        System.out.println(n+"^"+p+"="+pow);
    }
}