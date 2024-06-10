import java.util.*;
class swapping_2variables
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter both numbers=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped numbers are="+a+"&"+b);
    }
}