import java.util.*;
class reach_num
{
    static int steps(int t)
    {
        int s=1;
        int num=0;
        while(num!=t)
        {
           if((num+s)<=t)
           num=num+(s++);
           else
           num=num-(s++);
        }
        return (--s);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target=");
        int target=sc.nextInt();
        System.out.println("Steps="+steps(target));
    }
}