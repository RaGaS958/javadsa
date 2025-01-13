import java.util.*;
class equvalent_strings
{
    static boolean check(String arr1[],String arr2[])
    {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<arr1.length;i++)
        {
            s1.append(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            s2.append(arr2[i]);
        }
        if((s1.toString()).equals(s2.toString()))
        {
            return true;
        }
          else
        {
            return false;
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array=");
        int n=sc.nextInt();
        String arr1[]=new String[n];
        System.out.print("Enter Strings in first array:-");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.next();
        }
          System.out.print("Enter size of second array=");
         n=sc.nextInt();
        String arr2[]=new String[n];
        System.out.print("Enter Strings in second array:-");
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.next();
        }
        if(check(arr1,arr2))
        {
            System.out.println("Both array string is equivalent");
        }
        else
        {
            System.out.println("Both array string is not equivalent");
        }
    }
}