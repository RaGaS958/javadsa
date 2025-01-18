import java.util.*;
class Robot_moves
{
    static boolean moves(String s)
    {
        boolean b=true;
        int ud=0;
        int lr=0;
        for(int i=0;i<s.length();i++)
        {
            char pos=s.charAt(i);
            if(pos=='U')
            {
                ++ud;
            }
            else if(pos=='D')
            {
                --ud;
            }
            else if(pos=='L')
            {
                --lr;
            }
            else if(pos=='R')
            {
                ++lr;
            }
            if(lr!=0 && ud!=0)
            {
                b=false;
            }
        }
        return b;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movement of robot:-");
        String s=sc.next();
        System.out.println("Robot at origin= "+moves(s));
}
   
}