import java.util.*;
class Splitter_3
{
    static int count(String s,int init,int fina)
    {
        int c=0;
        String sub=s.substring(init,fina);
        for(int i=0;i<sub.length();i++)
        {
            if(sub.charAt(i)=='1')
            {
            ++c;
            }
        }
        return c;
    }
    static int check(String s)
    {
        int a=0;
        int b=0;
        int c=0;
        int count=0;
        int i=1;
        int j=s.length()-1;
        while(i<s.length()-1)
        {
            while(j>i)
            {
                a=count(s,0,i);
                b=count(s,i,j);
                c=count(s,j,s.length());
                System.out.println(s.substring(0,i)+" | "+s.substring(i,j)+" | "+s.substring(j,s.length()));
                System.out.printf(" a=%d b=%d c=%d %n",a,b,c);
                --j;
            if(a==b && b==c && a==c)
            {
            ++count;
            }
            }
            j=s.length()-1;
            i++;
        }
        return count;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code=");
        String s=sc.next();
        System.out.printf("Total number of possible substrings is %d %n",check(s));
    }
}