import java.util.*;
class min_chip_cost
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int max=0,c=0,pos=0,cost=0,e=0;
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements of arrays:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        for(int j=1;j<n;j++)
        {
        if(a[i]==a[j])
        c++;
    }
        if(c>max)
        {
            max=c;
            pos=a[i];
        }
          c=0;
     }
     for(int i=0;i<n;i++)
     {
     e=(pos-a[i]);
      if((e-1)%2==0)
      cost=cost+1;
    }
    System.out.println("Minimum cost in moving chips="+cost);
  }
}
     
     
        
        
        