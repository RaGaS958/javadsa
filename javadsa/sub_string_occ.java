import java.util.*;
class sub_string_occ
{
    static void occ(String s,String arr[])
    {
        for(int i=0;i<s.length();i++)
        {
            String key=s.substring(i,i+1);
            for(int j=0;j<arr.length;j++)
            {
                    for(int k=0;k<arr[j].length();k++)
                    {
                        if(key.equals(arr[j].substring(k,k+1)))
                        {
                            arr[j]=arr[j].replace(key,"");
                        }
                    }
            }
        }
    }
    static int count(String arr[])
    {
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()==0)
            cnt++;
        }
        return cnt;
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.print("Enter strings in array:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.print("Enter the word=");
        String word=sc.next();
        occ(word,arr);
        System.out.printf("Total number of substrings are %d %n",count(arr));
        
    }
}