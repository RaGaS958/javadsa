import java.util.*;
class ship_docker
{
    static int ship_docker(int a[],int d,int n)
    {
        int min=0, max=0;
        for(int i=0;i<a.length;i++)
        {
            if(min<a[i])
            min=a[i];
            max=max+a[i];
        }
          while(min<max)
          {
            int k=min+(max-min)/2;
            int sum=0,c=1;
            for(int i=0;i<a.length;i++)
            {
                sum=sum+a[i];
                if(sum==k)
                {
                ++c;
                sum=0;
            }
                if(sum>k)
                {
                    c++;
                    sum=a[i];
                }
            }
            if(c==d)
            return k;
            else if(c<d)
            max=k-1;
            else
            min=k+1;
    }
    return min;
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of containers=");
        int n=sc.nextInt();
        System.out.println("Enter the weight of each container:-");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the shipping days =");
        int d=sc.nextInt();
       System.out.println("Rate="+ship_docker(a,d,n));
    }
}