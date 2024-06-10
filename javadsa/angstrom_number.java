import java.util.*;
class angstrom_number
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
        int temp=n,ang=0;
        int r;
        while(n>0)
        {
            r=n%10;
            ang=ang+(r*r*r);
            n=n/10;
        }
        if(ang==temp)
        System.out.println("Enter number is angrostrom");
        else
        System.out.println("Enter number is not angrostrom");
    }
}