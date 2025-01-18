import java.util.*;
class Contigous_ones
{
    static boolean check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(s.charAt(i+1)=='1')
                return true;
                else
                return false;
            }
        }
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary code=");
        String s=sc.next();
        System.out.println("Contigous ones= "+check(s));
    }
}