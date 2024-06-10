import java.util.*;
class armstong_btw_two
{
   public static void main()
   {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the first number=");
       int a=sc.nextInt();
       System.out.println();
         System.out.print("Enter the Second number=");
       int b=sc.nextInt();
       System.out.println();
       int r1,r2,temp1=a,temp2=b,sum1=0,sum2=0;
       while(a>0)
       {
           r1=a%10;
           sum1=sum1+(r1*r1*r1);
           a=a/10;
        }
        while(b>0)
        {
            r2=b%10;
            sum2=sum2+(r2*r2*r2);
            b=b/10;
        }
        if(sum1==temp1 && sum2!=temp2)
        System.out.println("First number is armstrong");
        else if(sum2==temp2 && sum1!=temp1)
        System.out.println("Second number is armstrong");
        else if(sum1==temp1 && sum2==temp2)
        System.out.println("Both numbers are armstrong");
        else
        System.out.println("Both numbers are not armstrong");
    }
}