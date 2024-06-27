import java.util.*;
class concatenation_of_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n*2];
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        a[i+n]=a[i];
    }
        System.out.println("New array:-"+Arrays.toString(a));
     }
   }