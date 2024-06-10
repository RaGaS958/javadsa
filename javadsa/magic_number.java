import java.util.*;
class magic_number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
        int r;int sum=0;int flag=0;
        while (sum!=1 && sum!=4)
        {
            
        while(n>0);
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        n=sum;
    }
    if(sum==1)
    System.out.println("Entered number is magic number");
    else
    System.out.println("Entered number is not magic number");
}
}