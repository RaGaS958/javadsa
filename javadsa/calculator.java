import java.util.*;
class calculator
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the  first number=");
        double a=sc.nextDouble();
        System.out.println();
        System.out.print("Enter the  Second number=");
        double b=sc.nextDouble();
        System.out.println();
        System.out.println("Enter the operand=");
        char op=sc.next().charAt(0);
        System.out.println();
        double val=0;
        switch(op)
        {
            case '+': val=a+b;break;
            case '-': val=a-b;break;
            case '*': val=a*b;break;
            case '/': val=a/b;break;
            case '%' :val=a/b;break;
            default :System.out.println("Invalid operand");
        }
        System.out.println("a "+op+" b ="+val);
    }
}