import java.util.*;
class Longest_prefix
{
    static String prefix(String arr[])
    {
        StringBuilder s=new StringBuilder();
        int cond=shorty(arr);
        int j=0;
        while(j<cond)
        {
            char check=arr[0].charAt(j);
        for(int i=0;i<arr.length;i++)
        {
            if(check!=arr[i].charAt(j))
            {
                return s.toString();
            }
        }
        j++;
        s.append(check);
        }
        return "";
    }
    static int shorty(String arr[])
    {
        int i=99999;
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x].length()<i)
            i=arr[x].length();
        }
        return i;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.print("Enter the Strings:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.printf("Largest prefix is %s %n",prefix(arr));
    }
}