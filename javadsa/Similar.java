import java.util.*;
class Similar
{
    static boolean check(String s1,String s2)
    {
        boolean b=false;
        String arr1[]=s1.split(" ");//larger
        String arr2[]=s2.split(" ");//smaller
        for(String a1:arr2)
        {
            for(String b1:arr1)
            {
                if(a1.equals(b1))
                b=true;
            }
            if(!b)
            return false;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the larger String:-");
        String s1=sc.nextLine();
        System.out.print("Enter the smaller String:-");
        String s2=sc.nextLine();
        System.out.println("Similar String= "+check(s1,s2));
    }
}
