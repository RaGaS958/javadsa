import java.util.*;
class fair_candy
{
    static int  swapper(int [] a,int [] b,int [] c)
    {
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<b.length;j++)
        {
            int temp=a[i];
            a[i]=b[j];
            b[j]=temp;
             for(int k=0;k<a.length;k++)
             sum1=sum1+a[k];
             for(int w=0;w<b.length;w++)
             sum2=sum2+b[w];
             if(sum1==sum2)
             {
                 c[0]=a[i];
                 c[1]=b[j];
                 return 1;
                }
        else
         {
         sum1=0;
          sum2=0;
             temp=a[i];
            a[i]=b[j];
            b[j]=temp;
                }   
        }
    }
    return -1;
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of boxes of alice=");
        int n=sc.nextInt();
        System.out.println("Enter candies in each box of alice:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the number of boxes of bob=");
        int m=sc.nextInt();
        int [] b=new int[m];
        System.out.println("Enter candies in each box of alice:-");
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        int c[]=new int[2];
        int feed=swapper(a,b,c);
        if(feed==-1)
        System.out.println("Not possible");
        else if(feed==1)
        {
        System.out.println("Result ="+Arrays.toString(c));
    }

}
}
