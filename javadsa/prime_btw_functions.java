import java.util.*;
class prime_btw_functions
{
    static void prime_btw(int a,int b)
    {
        int flag=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j*j==0)
                flag++;
            }
            if(flag==0)
           System.out.println(i);
            flag=0;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Prime number btw "+a+" and "+b);
        prime_btw(a,b);
    }
}
            