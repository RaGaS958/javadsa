import java.util.*;
class compound_interest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the principal amount:-");
        double p=sc.nextDouble();
        System.out.println();
        System.out.print("Enter the rate of interest:-");
        double r=sc.nextDouble();
        System.out.println();
        System.out.print("Enter the time spann:-");
        double t=sc.nextDouble();
        System.out.println();
        double CI=p*(Math.pow(1+(r/100),t));
        System.out.print("Compound Interst ="+CI);
    }
}
        