import java.util.*;
class disarium_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
        int count=n,temp=n;
        int r,sum=0, pow=0,p=1;
        while(count>0)
        {
            pow++;
            count=count/10;
        }
        while(n>0)
        {
            r=n%10;
            for(int i=0;i<pow;i++)
            p=p*r;
            sum=sum+p;
            pow--;
            n=n/10;
            p=1;
        }
        if(temp==sum)
        System.out.println("Entered number is disarium number");
        else
        System.out.println("Entered number is not disarium number"+sum);
    }
}