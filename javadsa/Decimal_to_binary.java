import java.util.*;
class Decimal_to_binary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Decimal number=");
        int n=sc.nextInt();
        int r,i=0;
        int ar[]=new int[1000];
        while(n>0)
        {
            r=n%2;
            ar[i]=r;
            i++;
            n=n/2;
        }
        System.out.print("Decimal to Binary conversion=");
        for(int j=i-1;j>=0;j--)
        System.out.print(ar[j]);
        System.out.println();
    }
}
        
        