import java.util.*;
class guess_number_higher_lower
{
    static int guess(int a,int b)
    {
        if(b>a)
        return -1;
        if(b<a)
        return 1;
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range =");
        int n=sc.nextInt();
        System.out.println("Player 1 should enter any number btw 0 to "+n);
        int n1=sc.nextInt();
        int sum=0;
        int n2=0;
        do
        {
            System.out.println("Player 2 guess pls=");
            n2=sc.nextInt();
            sum=sum+guess(n1,n2);
    }while(sum+guess(n1,n2)!=sum);
    System.out.println("credit="+sum);
}
}
