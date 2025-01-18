import java.util.*;
class maximum_substring
{
    static int maxsub(String s,String w)
    {
        int st=0;
        for(int i=0;i<s.length()-w.length()+1;i++)
        {
            if(w.equals(s.substring(i,i+w.length())))
            st++;
        }
        return st;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.print("Enter the substring=");
        String w=sc.next();
        System.out.printf("maximum number of substring=%d %n",maxsub(s,w));
    }
}