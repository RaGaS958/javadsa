import java.util.*;
class Merging_String
{
    static String merger(String a,String b)
    {
        StringBuilder s=new StringBuilder();
        int n1=a.length();
        int n2=b.length();
        int max=0;
        String ma="";
        if(n1>n2)
        {
             ma=a;
             max=n2;
        }
        else if(n2>n1)
        {
            ma=b;
             max=n1;
        }
        else
        {
             max=n2;
        }
        for(int i=0;i<max;i++)
        {
            s.append(a.charAt(i));
            s.append(b.charAt(i));
        }
        if(n1!=n2)
        s.append(ma.substring(max,ma.length()));
        return s.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String=");
        String a=sc.next();
        System.out.print("Enter the Second String=");
        String b=sc.next();
        System.out.printf("Merged String is %s %n",merger(a,b));
    }
}