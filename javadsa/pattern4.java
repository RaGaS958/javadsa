  import java.util.*;
class pattern4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows and columns=");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println();
        int count=1;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
        System.out.print(count);
        count++;
    }
  System.out.println();
    }
}
}