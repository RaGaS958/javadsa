import java.util.*;
class linear_search_pos
{
    static int  check(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        if(a[i]==target)
        return i;
        return -1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int a[] =new int[n];
       for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the target=");
        int target=sc.nextInt();
        System.out.println("Target found at"+check(a,target));
    }
}
        
        