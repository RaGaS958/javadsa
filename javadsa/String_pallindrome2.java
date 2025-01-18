import java.util.*;
class String_pallindrome2
{
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
    static boolean make(String  s)
    {
        boolean b=false;
        if(check(s))
        return true;
        else
        {
            StringBuilder ss=new StringBuilder();
            int cnt=0;
            while(cnt<s.length())
            {
            for(int i=0;i<s.length();i++)
            {
                if(i==cnt)
                {
                    continue;
                }
                else
                {
                    ss.append(s.charAt(i));
                }
            }
            if(check(ss.toString()))
            {
                return true;
            }
            else
            {
                ss.setLength(0);
                cnt++;
            }
        }
    }
        return b;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.println("String can be pallindrome= "+make(s));
    }
}