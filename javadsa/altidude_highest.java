import java.util.*;
class altidude_highest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of points=");
        int n=sc.nextInt();
        System.out.println();
        int [] gain=new int[n-1];
        System.out.println("Enter the gains :-");
        for(int i=0;i<n-1;i++)
        gain[i]=sc.nextInt();
        int [] net=new int[n];
        for(int i=1;i<n;i++)
        {
            net[i]=net[i-1]+gain[i-1];
        }
        int max=0;
        for(int i=0;i<n;i++)
        if(max<net[i])
        max=net[i];
        System.out.println("Highest altidude gain="+max);
    }
}