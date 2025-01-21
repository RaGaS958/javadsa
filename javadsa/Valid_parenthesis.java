import  java.util.*;
class Valid_parenthesis
{
    static boolean check(String s)
    {
        boolean a=true;
        boolean b=true;
        boolean c=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1)=='}' || s.charAt(i+1)==']')
                    return false;
                }
                if(a)
                a=false;
                else
                a=true;
            }
            else if(ch=='[')
            {
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1)==')' || s.charAt(i+1)=='}')
                    return false;
                }
                if(b)
                b=false;
                else
                b=true;
            }
            else if(ch=='{')
                {
                     if(i<s.length()-1)
                {
                    if(s.charAt(i+1)==')' || s.charAt(i+1)==']')
                    return false;
                }
                if(c)
                c=false;
                else
                c=true;
                }
                  else if(ch==')')
            {
                if(a)
                a=false;
                else
                a=true;
            }
            else if(ch==']')
            {
                if(b)
                b=false;
                else
                b=true;
            }
            else if(ch=='}')
                {
                if(c)
                c=false;
                else
                c=true;
            
            }
    }
    if (a==true && b==true && c==true)
    return true;
    else
    return false;
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String=");
    String s=sc.next();
    System.out.println("Valid parenthesis= "+check(s));
}
}