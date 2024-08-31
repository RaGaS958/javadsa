import java.util.*;
class ceiling_string
{
    static char check(char a[],char target)
    {
        int start=0;
        int end=a.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[mid]>target)
            end=mid-1;
            else if(a[mid]<target)
            start=mid+1;
            else if(a[mid]==target)
            return a[(mid+1)%(a.length)];
        }
        return a[start%(a.length)];
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        System.out.println("Enter elements:-");
        char [] a =new char[n];
        for(int i=0;i<n;i++)
        a[i]=sc.next().charAt(0);
        System.out.println("Enter the target string:-");
        char target=sc.next().charAt(0);
        System.out.println("result will be "+check(a,target));
    }
}