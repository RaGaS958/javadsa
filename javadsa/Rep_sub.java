import java.util.*;
class Rep_sub
{
    static int rep(String a,String b)
    {
        int c=1;
        String aa=a;
        while(a.length()<b.length())
        {
            a=a+aa;
            System.out.println(a);
            ++c;
        }
        boolean cond=true;
        while(cond)
        {
        for(int i=0;i<a.length();i++)
        {
            if((i+(b.length()-1))<a.length())
            {
                if(a.substring(i,(i+(b.length()))).equals(b))
                {
                    
                    cond=false;
                    break;
                }
            }
            else
            {
                a=a+aa;
                System.out.println(a);
                ++c;
                break;
            }
        }
        }
        return c;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a=");
        String a=sc.next();
        System.out.print("Enter the b=");
        String b=sc.next();
        System.out.println("Repeatation="+rep(a,b));
    }
}