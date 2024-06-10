import java.util.*;
class sum_till_zero
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=1;int sum=0;
        while(n!=0)
        {
            n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum="+sum);
    }
}