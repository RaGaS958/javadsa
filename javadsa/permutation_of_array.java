import java.util.*;
class permutation_of_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.print("Enter the Size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Original array:-"+Arrays.toString(a));
        temp=a[n-1];
        for(int i=1;i<n;i++)  
            a[n-i]=a[n-1-i];
        a[0]=temp;
        System.out.println("Permutated array:-"+Arrays.toString(a));
      }
}