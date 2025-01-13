import java.util.*;
class book_all
{
    static boolean checkpage(int arr[],int k,int pagelim)
    {
        int cnt=1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>pagelim)
            {
                cnt++;
                sum=arr[i];
            }
            sum+=arr[i];
        }
        return (cnt<=k);
    }
    static int alloc(int arr[],int k)
    {
        if(k>arr.length)
        {
            return -1;
        }
        int max=0;
        int min=-999999;
        for(int i=0;i<arr.length;i++)
        {
            max+=arr[i];
            if(min<arr[i])
            min=arr[i];
        }
         if(k==1)
          return max;
          if(k==arr.length)
          return min;
          for(int i=min;i<=max;i++)
          {
              if(checkpage(arr,k,i))
              return i;
            }
         return -1;
        }       
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Number of pages in the array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int k=0;
       do
        {
        System.out.print("Enter the number of Students=");
         k=sc.nextInt();
         if(k!=0)
         {
        int book=alloc(arr,k);
        if(book==-1)
        System.out.println("Book allocation not possible");
        else
        System.out.println("Maximum page alloted to a student will be "+book);
        }
    }while(k!=0);
}
}
        
    
        
    
    