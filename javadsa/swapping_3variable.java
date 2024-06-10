import java.util.*;
class swapping_3variable
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println();
        double d=Math.random();
        if(d*10>5)
        {
            a=a+b+c;
            b=a-b-c;
            c=a-b-c;
            a=a-b-c;
        }
        else if(d*10<5)
        {
            a=a+b+c;
            c=a-b-c;
            b=a-b-c;
            a=a-b-c;
        }
        else
        {
            b=a+b+c;
            c=b-a-c;
            a=b-a-c;
            b=b-a-c;
        }
        System.out.println("swapped numbers are ="+a+" , "+b+" & "+c);
    }
}