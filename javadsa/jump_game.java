import java.util.*;
class jump_game
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int sum=0;
        for(int i=1;i<n-1;i++)
        sum=sum+a[i];
        System.out.println(Arrays.toString(a));
        if(sum>n-1)
        System.out.println("Success");
        else
        System.out.println("failure");
    }
}