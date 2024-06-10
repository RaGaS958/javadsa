import java.util.*;
class roots
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coefficients a,b,c of quadratic equation ax2+bx+c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(b*b)-(4*a*c);
        double root1=-((-b)+(Math.sqrt(d)))/(2*a);
        double root2=-((-b)-(Math.sqrt(d)))/(2*a);
        System.out.println("roots of quadtratic equation "+a+"x^2 + "+b+
        "x +"+c+" are " +root1+"and"+root2);
    }
}
        
        