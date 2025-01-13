import java.util.*;
class sorting_sentence
{
    static void sorting(String s,String arr[])
    {
        int st=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                int num=s.charAt(i-1);
                num=num-49;
                arr[num]=s.substring(st,i-1);
                st=i+1;
            }
        }
    }    
    static String sen(String arr[])
    {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==null)
            continue;
            else
            ss.append(arr[i]+" ");
        }
        return ss.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        System.out.print("Enter the sentence:-");
        String s=sc.nextLine();
        s=s+" ";
       sorting(s,arr);
       System.out.println(sen(arr));
    }
}
