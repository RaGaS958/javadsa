import java.util.*;
class doubleexist
{
    static boolean doublee(int a[])
    {
      
         for(int i=0;i<a.length-1;i++)
        for(int j=i+1;j<a.length;j++)
        if((a[i]/2)==a[j] && (a[j]*2)==a[i])
        return true;
        return false;
    }
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array=");
    int n=sc.nextInt();
    int [] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("Output= "+doublee(a));
}
}
   