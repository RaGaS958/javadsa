import java.util.*;
class goal_parser
{
    static String parser(String s)
    {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='G')
            {
                result.append("G");
            }
            else if(s.charAt(i)=='(')
            {
                if(s.substring(i,i+2).equals("()"))
                {
                    result.append("o");
                    i+=1;
                }
                else if(s.substring(i,i+4).equals("(al)"))
                {
                    result.append("al");
                    i+=3;
                }
                else
                {
                    return "!!!!";
                }
            }
            else
            {
                return "!!!!";
            }
        }
        return result.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code=");
        String code=sc.next();
        String result=parser(code);
        if(result.equals("!!!!"))
        {
            System.out.println("Error!!!!!");
        }
        else
        {
            System.out.printf("Resultant String = %s %n",result);
        }
        
    }
}