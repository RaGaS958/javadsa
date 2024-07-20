import java.util.*;
class linear_search_string
{
    static boolean check(String a,char target)
    {
        for(int i=0;i<a.length();i++)
        {
        if(a.charAt(i)==target)
        return true;
        }
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:-");
        String a =sc.nextLine();
        System.out.print("Enter the target=");
       char target=sc.next().charAt(0);
       if( check(a,target))
       System.out.println("Target found");
       else
       System.out.println("target not found");
    }
}
        
        