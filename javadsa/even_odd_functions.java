import java .util.*;
class even_odd_functions
{
    static void check(int n)
    {
        if(n%2==0)
        System.out.println("Even number");
        else if(n==0)
        System.out.println("zero entered");
        else
        System.out.println("Odd number");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
        check(n);
    }
}
        