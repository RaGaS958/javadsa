import java.util.*;
class rotate_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements in array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the number of rotaion=");
        int k=sc.nextInt();
        int temp=0,last=0;;
        System.out.println("Original matrix:-"+Arrays.toString(a));
        while(k>0)
        {
            last=a[n-1];
        for(int j=n-1;j>0;j--)
        {
         a[j]=a[j-1];
        }
         a[0]=last;
          k--;
        }
    System.out.println("Rotated array:-"+Arrays.toString(a));
}
}
            
            