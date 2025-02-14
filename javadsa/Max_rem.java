import java.util.*;
class Max_rem
{
    static int maxRem(String s,String p,int arr[])
    {
        int c=0;
        int ii=0;
        String ss="";
        int f=s.length();
        boolean che=false;
        while(ii<arr.length)
        {
            int rem=arr[ii];
            for(int i=0;i<f;i++)
            {
                if(i!=rem)
                {
                    ss=ss+s.charAt(i);
                }
            }
            int st=0;
            for(int j=0;j<p.length();j++)
            {
                char ch=p.charAt(j);
                for(int k=st;k<ss.length();k++)
                {
                    if(ss.charAt(k)==ch)
                    {
                    che=true;
                    st=k;
                    break;
                    }
                }
                if(che==false)
                {
                    return c;
                }
                else
                {
                    che=false;
                }
            }
                System.out.println(ss);
                s=ss;
                ss="";
                ++c;
                ++ii;
                f=s.length();
        }
        return c;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the main String=");
        String s=sc.next();
        System.out.print("Enter the subsequence=");
        String p=sc.next();
        System.out.print("Enter the length of remove array=");
        int n=sc.nextInt();
        System.out.print("Enter the remove index=");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Max subsequence="+maxRem(s,p,arr));
        
    }
}