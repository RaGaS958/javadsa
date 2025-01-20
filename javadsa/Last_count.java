import java.util.*;
class Last_count
{
    static int last(String s)
    {
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                ++cnt;
            }
            else
            {
                return cnt;
            }
        }
        return cnt;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.nextLine();
        System.out.printf("Length last word is %d %n",last(s));
    }
}