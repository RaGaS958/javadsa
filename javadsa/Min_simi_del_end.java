import java.util.*;
class Min_simi_del_end
{
    static int minSize(String s)
    {
        int st=0;
        int end=s.length()-1;
       while(st<end)
       {
           char ch=s.charAt(st);
           char ch1=s.charAt(end);
           if(ch1==ch)
           {
             while(ch==s.charAt((st++)+1))
             {
                }
                 while(ch1==s.charAt((end--)-1))
             {
                }
            }
            else
            {
                return end-st+1;
            }
        }
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.printf("Min length of string=%d %n",minSize(s));
    }
}