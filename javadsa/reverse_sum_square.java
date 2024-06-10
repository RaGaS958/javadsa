import java.util.*;
class reverse_sum_square
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
        int r,rev=0,sum=0,sq=1;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            sum=sum+r;
            sq=sq*r;
            n=n/10;
        }
        System.out.println("reverse of entered number="+rev+"\n sum of digits="+sum+"\n product of digits="+sq);
    }
} 