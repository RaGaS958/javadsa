import java.util.*;
class array_basic_input_output
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println();
        int [] ar=new int[n];
        System.out.println("Enter the elements in array:-");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        System.out.println(Arrays.toString(ar));
    }
}