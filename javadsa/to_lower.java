import java.util.*;
class to_lower
{
    static String low(String s)
    {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>90)
            ss.append((char)(s.charAt(i)-32));
            else
            ss.append(s.charAt(i));
        }
        return ss.toString();
    }
    public static void main()
    {
        String s="hElO";
        System.out.println(low(s));
    }
}