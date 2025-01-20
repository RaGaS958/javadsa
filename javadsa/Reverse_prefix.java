import java.util.*;
class Reverse_prefix
{
    static String reverse(String s,char ch)
    {
        if(s.indexOf(ch)==-1)
        {
            return s;
        }
        else
        {
            int n=s.indexOf(ch);
            StringBuilder ss=new StringBuilder();
            for(int i=n;i>=0;i--)
            ss.append(s.charAt(i));
            ss.append(s.substring(n+1,s.length()));
            return ss.toString();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.print("Enter the char=" );
        char ch=sc.next().charAt(0);
        System.out.printf("Final String will be %s %n",reverse(s,ch));
    }
}