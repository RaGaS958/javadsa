import java.util.*;
class Shuffle_the_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int j=0;j<3;j++)
        for(int i=0;i<n-1;i++)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.println("Shuffled array:-"+Arrays.toString(a));
    }
}