import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.println();
        int temp,r,rev=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(temp==rev)
        System.out.println("Number is Palindrome");
        else
        System.out.println("Number is not palindrome");
    }
}