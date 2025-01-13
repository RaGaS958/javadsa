import java.util.*;
class defanging_ip
{
    static String defanging(String ip)
    {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<ip.length();i++)
        if(ip.charAt(i)==('.'))
        {
            s.append("[.]");
        }
        else
        {
            s.append(ip.charAt(i));
        }
        return s.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ip address=");
        String ip=sc.next();
        System.out.printf("Defanged ip = %s %n",defanging(ip));
    }
}