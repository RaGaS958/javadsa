import java.util.*;
class missing_positive
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size=");
        int n=sc.nextInt();
        System.out.println("Enter the elements:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++)
        for(int j=0;j<n-1;j++)
        {
        if(a[j]>a[j+1])
        {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
    int c=1;
    for(int i=0;i<n;i++)
    if(a[i]==1)
    c=0;
    for(int i=0;i<n-1;i++)
    if(a[i]>0 && a[i+1]>0)
    if(a[i+1]-a[i]>1)
    c=c+(a[i+1]-a[i]-1);
    System.out.println("Positive number missing="+c);
}
}
    
