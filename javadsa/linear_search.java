import java.util.*;
class linear_search
{
    static boolean check(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        if(a[i]==target)
        return true;
        return false;
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
       if( check(a,target))
       System.out.println("Target found");
       else
       System.out.println("target not found");
    }
}
        
        