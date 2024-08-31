import java.util.*;
class intersection_two_array2
{
    static int counter(int [] a,int []b )
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        for(int j=0;j<b.length;j++)
        if(a[i]==b[j])
        {
        count++;
        break;
       }
        return count;
    }
     static void intersection(int [] a,int []b ,int [] c)
    {
        int k=0;
        for(int i=0;i<a.length;i++)
        for(int j=0;j<b.length;j++)
        if(a[i]==b[j])
        {
        c[k++]=a[i];
        break;
       }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array=");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements in first array:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the size of second array=");
        n=sc.nextInt();
        int [] b=new int[n];
        System.out.println("Enter the elements in second array:-");
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        int [] c=new int[counter(a,b)];
        intersection(a,b,c);
        System.out.println("Result ="+Arrays.toString(c));
    }
}