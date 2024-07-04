import java.util.*;
class two_sum
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    int i,j,t,N1=0 ,N2=0,flag=0;
    System.out.print("Enter the size of array=");
    int n=sc.nextInt();
    int [] a=new int[n];
    System.out.println("Enter the elements of array:-");
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.print("Enter the target=");
    t=sc.nextInt();
    for(i=0;i<n;i++)
    for(j=1;j<n;j++)  
    if(a[i]+a[j]==t)
    {
    N1=i;N2=j;
    }
    if(N1!=N2)
    System.out.println("Target sum found at [ "+Math.max(N1,N2)+" , "+Math.min(N2,N1)+" ]");
    else
    System.out.println("Target sum not possible");

 }
}