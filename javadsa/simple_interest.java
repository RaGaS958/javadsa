import java .util.*;
class simple_interest
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the principal value");
        double p=a.nextDouble();
        System.out.println("Enter the rate of interest");
        double r=a.nextDouble();
        System.out.println("Enter the time period");
        int t=a.nextInt();
        double SI=(p*r*t)/100;
        System.out.println("Simple interst ="+SI);
    }
}
