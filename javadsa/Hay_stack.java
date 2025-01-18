import java.util.*;
class Hay_stack
{
    static int search(String pin,String hay)
    {
        int f=-1;
        char st=pin.charAt(0);
        for(int i=0;i<hay.length();i++)
        {
            if(hay.charAt(i)==st)
            {
                if(hay.substring(i,i+pin.length()).equals(pin))
                return i;
            }
        }
        return f;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Hay String=");
        String hay=sc.next();
        System.out.print("Enter the pin String=");
        String pin=sc.next();
        System.out.printf("First occurence of pin at %d %n",search(pin,hay));
    }
}