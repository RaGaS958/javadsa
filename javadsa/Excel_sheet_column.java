import java.util.*;
class Excel_sheet_column
{
    static String convo(int n)
    {
        StringBuilder s=new StringBuilder();
        while(n>0)
        {
             int temp=n%26;
             if(temp==0)
             {
                 s.append('Z');
                 n=n/26-1;
                }
                else
                {
               s.append((char)(64+temp));
               n=n/26;
              }
        }
        return s.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the column number= ");
        int n=sc.nextInt();
        System.out.printf("Column tag is %s %n",convo(n));
    }
}
