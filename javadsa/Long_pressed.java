import java.util.*;
class Long_pressed
{
    static boolean check(String type,String name)
    {
        boolean state=false;
        int go=0;
        for(int i=0;i<name.length()-1;i++)
        {
            char st=name.charAt(i);
            char en=name.charAt(i+1);
            for(int j=go;j<type.length()-1;j++)
            {
                if(type.charAt(j)==st)
                {      
                    if(type.charAt(j+1)==en)
                    {
                        state=true;
                        go=j+1;
                        break;
                    }
                    else
                    {
                        state=false;
                    }
                }
                if(!state)
                return false;
            }
        }
        return state;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name=");
        String name=sc.next();
        System.out.print("Enter the type name=");
        String type=sc.next();
        System.out.println("Type is name= "+check(type,name));
    }
}