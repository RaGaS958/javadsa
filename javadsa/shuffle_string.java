import java.util.*;
class shuffle_string
{
    static void shuffle(String s,int [] a,char [] arr)
    {
        for(int i=0;i<a.length;i++)
        {
            arr[a[i]]=s.charAt(i);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=sc.next();
        char [] arr=new char[s.length()];
        int [] a=new int[s.length()];
        System.out.print("Enter the shuffle array:-");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        shuffle(s,a,arr);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            result.append(arr[i]);
        }
        System.out.printf("Result= %s %n",result.toString());
    }
}