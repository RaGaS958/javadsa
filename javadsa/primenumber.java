import java.util.*;
class primenumber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number=");
        int n=sc.nextInt();
        System.out.println();
        if(n==0 || n==1)
        {
            System.out.println("Invalid Input");
        }
        else if(n==2)
        {
            System.out.println("Enter number is prime");
        }
        else
        {
            int flag=0;
            for(int i=2;i<n;i++)
            {
                if(n%(i*i)==0)
                flag++;
            }
            if(flag==0)
            System.out.println("Enter number is prime");
            else
            System.out.println("Enter number is not prime");
        }
    }
}