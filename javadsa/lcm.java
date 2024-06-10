import java.util.*;
class lcm
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number=");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=n && i<=n1;++i)
          { 
              if(n%i==0 && n1%i==0)
              gcd=i;
        }
            int lcm=n*n1/gcd;
            System.out.println("Lcm="+lcm);
        }
    }
        