import java.util.*;
class kth_positive_missing
{
     static int missing(int a[],int k)
     {
         int kk=1;
         if(a[0]!=1)
         {
             if(k==1)
             return 1;
             else 
             kk++;
            }
            int start=0;
            int end=a.length-1;
            while(start<end)
            {
                if(a[start+1]-a[start]>1)

                {
                    for(int i=a[start]+1;i<a[start+1];i++)
                    {
                        if(k==kk)
                        return i;
                        else
                        kk++;
                    }
                }
                start++;
            }
            int s=a[a.length-1]+1;
            while(kk!=k)
            {
                s++;
                kk++;
            }
            return s;    
        }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
        System.out.println("Enter the elments in array:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter the target missing element:-");
        int k=sc.nextInt();
        System.out.println("Missing ="+missing( a,k));
    }
}