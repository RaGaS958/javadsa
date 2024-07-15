import java.util.*;
class house_robber
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of houses:-");
        int n=sc.nextInt();
        System.out.println("Enter stash money in each house:-");
        int [] h=new int[n];
        for(int i=0;i<n;i++)
        h[i]=sc.nextInt();
        int max=0,money=0;
        int i=0;
        while(i<n-1)
        {
        for(int j=i;j<n;j=j+2)
        {
            money= money+h[j];
        }
        if(money>max)
        max=money;
        i++;
        money=0;
    }
    System.out.println("Maximum money robber can rob tonight :-"+max);
 }
}