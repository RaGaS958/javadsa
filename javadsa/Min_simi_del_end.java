import java.util.*;
class Min_simi_del_end
{
    static int minSize(String s)
    {
        int st=0;
        int end=s.length()-1;
        while(st<=end && (s.charAt(st)==s.charAt(end)))
        {
            char ch=s.charAt(st);
              if(st==end)
            {
                return 0;
            }
            while(s.charAt(st)==ch)
            {
                st++;
                System.out.print(st+" ");
                System.out.println("Start");
            }
            while(s.charAt(end)==ch)
            {
                end--;
                System.out.print(end+" ");
                System.out.println("end");
            }
          
            s=s.substring(st,end+1);
            st=0;
            end=s.length()-1;

        }
        return s.length();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        System.out.printf("Min length of string=%d %n",minSize(s));
    }
}