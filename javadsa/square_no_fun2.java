import java.util.*;
class square_no_fun2
{
    static int check(int a[][],int target)
    {
        int start=0;
        int end=a.length-1;
         int mid =0;
        for(int i=0;i<target/2;i++)
        while(start<=end)
        {
         mid=start+((end-start)/2);
        if(target>a[mid][0])
        start=mid+1;
        else if(target<a[mid][0])
        end=mid-1;
        else if(target==a[mid][0])
        return a[mid][1];
       }
    return a[end][1];
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the square=");
        int n=sc.nextInt();
          int [][] a=new int[n][2];
          for(int i=1;i<n;i++)
              {
                  a[i-1][0]=i*i;
                   a[i-1][1]=i;
                }
       System.out.println("Square root will be "+check(a,n));
    }
}