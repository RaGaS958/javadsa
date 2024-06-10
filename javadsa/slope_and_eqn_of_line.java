import java.util.*;
class slope_and_eqn_of_line
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first coordinate:-");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter the Second coordinate:-");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        x1=x2-x1;
        y1=y2-y1;
        double s=y1/y2;
        System.out.println("Slope="+s);
        System.out.println("Equation of line:-\n(y-"+y2+")="+s+"(x-"+x2+")");
    }
}