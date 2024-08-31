import java.util.*;
class arranging_coin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of coins=");
        int n=sc.nextInt();
           int k=1;
      while(n>=0)
      { 
          n=n-k;
          k++;
        }
        int s=k-2;
        System.out.println("Number of stairs filled= "+s);
    }
}