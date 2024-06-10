import java.util.*;
class sum_negative_positiveeven_positiveodd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int sumnegative=0,sumeven=0,sumodd=0,n=0;
        System.out.println("Enter the Numbers:-");
        do
        {
             n=sc.nextInt();
            if(n<0)
            sumnegative=sumnegative+n;
            else if(n%2==0)
            sumeven=sumeven+n;
            else
            sumodd=sumodd+n;
        }while(n!=0);
        System.out.println("Sum of negative="+sumnegative);
        System.out.println("Sum of even numbers="+sumeven);
        System.out.println("Sum of odd numbers="+sumodd);
    }
}
        