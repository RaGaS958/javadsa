import java.util.*;
class Decrypt_string
{
    static String convert(String s)
    {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length()-1;i++)
        {
            char st=s.charAt(i);
            char en=s.charAt(i+1);
            if(i+2<s.length())
            {
            if(s.charAt(i+2)!='#')
            {
                ss.append((char)(96+(st-48)));
                ss.append((char)(96+(en-48)));
                i+=1;
            }
            else
            {
                int rev=(st-48)*10+(en-48);
                ss.append((char)(96+rev));
                i+=2;
            }
           }
           else
           {
                ss.append((char)(96+(st-48)));
                ss.append((char)(96+(en-48)));
            }
        }
        return ss.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the code=");
       String s=sc.next();
       System.out.printf("descrypted code will be %s %n",convert(s));
    }
}