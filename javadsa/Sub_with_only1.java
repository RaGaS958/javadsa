import java.util.*;
class Sub_with_only1
{
    static int minSub(String s)
    {
        int cnt=0;
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                r++;
            }
            else
            {
                for(int j=r;j>0;j--)
                {
                    cnt=cnt+j;
                }
                r=0;
            }
        }
         for(int j=r;j>0;j--)
                {
                    cnt=cnt+j;
                }
        
        return cnt;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.println("Number of substrings with 1's only="+minSub(s));
    }
}