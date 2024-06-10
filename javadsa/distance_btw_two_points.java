import java.util.*;
class distance_btw_two_points
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
        double d=Math.sqrt((x1*x1)+(y1*y1));
        System.out.println("Distance btw points are="+d);
    }
}