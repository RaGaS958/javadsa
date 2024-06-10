import java.util.*;
class special_number
{
    public static void main()
    {
        System.out.print("Enter the number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        int temp=n,r,f=1,sum=0;
        while(n>0)
        {
            r=n%10;
            for(int i=1;i<=r;i++)
            f=f*i;
            sum=sum+f;
            f=1;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("Enter number is Special");
        else
        System.out.println("Enter number is not Special");
    }
}