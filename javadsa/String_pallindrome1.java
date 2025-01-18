import java.util.*;
class String_pallindrome1
{
    static String conv(String s)
    {
        StringBuilder ss=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            {
            ss.append(c);  
        }
        }
        return ss.toString();
    }
    static boolean check(String s)
    {
         StringBuilder ss=new StringBuilder();
         for(int i=s.length()-1;i>=0;i--)
         {
             ss.append(s.charAt(i));
         }
         if(s.equals(ss.toString()))
         return true;
         else
         return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string=");
        String s=sc.nextLine();
        System.out.println("String is pallindrome= "+check(conv(s)));
    }
}