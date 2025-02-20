import java.util.*;
class Homo_sub
{
    static int  homo(String s)
    {
         int cnt=1;
         int total=0;
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             while(i+1<s.length() && ch==s.charAt(i+1))
             {
                 cnt++;
                 i++;
                }
                while(cnt>0)
                {
                    total+=(cnt--);
                }
                cnt=1;
            }
        return total;
        }   
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String=");
            String s=sc.next();
            System.out.printf("The number of homogenous substrings are %d %n",homo(s));
        }
    }
