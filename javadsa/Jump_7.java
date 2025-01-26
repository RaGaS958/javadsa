import java.util.*;
class Jump_7
{
    static boolean gameStart(String s,int min,int max)
    {
        boolean res=true;
        int i=0;
        int j=1;
       if(s.charAt(s.length()-1)!='0')
        {
           return false;
       }
       else if(s.charAt(0)!='0')
       {
           return false;
        }
        else
        {
        while(j<s.length())
        {

            if(s.charAt(j)=='0')
            {
                if(j-i>=min && j-i<=max)
                {
                i=j;
                }
                else
                {
                    return false;
                }
               
                
            }
             ++j;
        }
    }
        return res;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code=");
        String game=sc.next();
        System.out.print("Enter the min jump=");
        int min=sc.nextInt();
        System.out.print("Enter the max jump=");
        int max=sc.nextInt();
        System.out.println("Game= "+gameStart(game,min,max));
    }
}
