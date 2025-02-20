import java.util.*;
class Basic_calc
{  
    static String calc(String s)
    {
        StringBuilder ss=new StringBuilder();
        char arr[]={'/','*','+','-'};
        int end=0;
        int cal=0;
        while(end<4)
        {
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==arr[end])
                {
                    if(arr[end]=='/')
                    cal=(s.charAt(i-1)-48)/(s.charAt(i+1)-48);
                    else if(arr[end]=='*')
                    cal=(s.charAt(i-1)-48)*(s.charAt(i+1)-48);
                    else if(arr[end]=='+')
                    cal=(s.charAt(i-1)-48)+(s.charAt(i+1)-48);
                    else if(arr[end]=='-')
                    cal=(s.charAt(i-1)-48)-(s.charAt(i+1)-48);
                    ss.append(s.substring(0,i-1)+cal+s.substring(i+2,s.length()));
                    s=ss.toString();
                }
                if(i==s.length()-1)
                {
                    end++;
                }
            }
        }
        if(s.length()>1 &&(s.charAt(1)=='*' || s.charAt(1)=='+' || s.charAt(1)=='/' || s.charAt(1)=='-'))
        return s.substring(3,s.length());
        else
        return s;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the equation=");
        String s=sc.next();
        System.out.printf("Final answer=%s %n",calc(s));
    }
    
}