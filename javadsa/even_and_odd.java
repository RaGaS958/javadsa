import java.util.*;
class even_and_odd
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        if(n==0)
        System.out.println("zero is enterd");
        else if(n%2==0)
        System.out.println("even number");
        else
        System.out.println("odd number");
    }
}