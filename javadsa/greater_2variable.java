import java.util.*;
class greater_2variable
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();
        int max;
        int tot=a+b;
        if(a>b)
        max=a;
        else
        max=b;
        System.out.println("max number="+max+"\nmin number="+(tot-max));
    }
}
        