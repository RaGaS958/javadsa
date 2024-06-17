import java.util.*;
class pythagorian_triplet
{
    static void check(double a,double b,double c)
{
    if(((a*a)+(b*b))==(c*c))
    System.out.println("Pythagorian Triplet");
    else
    System.out.println("Not a pythagorian Triplet");
}
public static void ranger()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Numbers:-");
    double a=sc.nextInt();
    double b=sc.nextInt();
    double c=sc.nextInt();
    check(a,b,c);
}
}