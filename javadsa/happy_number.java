import java.util.*;
class happy_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        System.out.println();
        int r,sum=0,flag=0;
        while(sum!=1 && sum!=4)
        {
            while(n>0)
            {
                r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            n=sum;
        }
        if(sum==1)
        System.out.println("Entered number is happy number");
        else
        System.out.println("Enterd number is unhappy number");
    }
}