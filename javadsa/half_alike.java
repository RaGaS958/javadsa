import java.util.*;
class half_alike
{
    static boolean check(String s)
    {
        int c1=0;
        int c2=0;
        for(int i=0;i<(s.length()/2);i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i')
            c1++;
        }
        for(int i=(s.length()/2);i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i')
            c2++;
        }
        return (c1==c2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        if(check(s))
        {
            System.out.println("Alike string");
        }
        else
        {
            System.out.println("not alike String");
        }
    }
}