import java.util.*;
class koko_banana
{
    static int rate(int a[],int h)
    {
        int min=1;
        int max=0;
        for(int i=0;i<a.length;i++)
        if(max<a[i])
        max=a[i];
        int c=0;
        while(min<max)
        {
            int k=min+(max-min)/2;
            for(int i=0;i<a.length;i++)
            {
                if(k>=a[i])
                c++;
                else
                {
                    int s=a[i];
                    while(s>k)
                    {
                    s=s-k;
                    c++;
                    }
                    c++;
                }
            
            }
            if(c>h)
            min=k+1;
            else if(c<h)
            max=k-1;
            else if(c==h)
            return k;
            c=0;
            
        }
        return max;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers of piles= ");
        int n=sc.nextInt();
        System.out.println("Enter banana in each pile:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter gaurd returning hours =");
        int h=sc.nextInt();
        System.out.println("rate of koko="+rate(a,h));
    }
}