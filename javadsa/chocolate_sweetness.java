import java.util.*;
class chocolate_sweetness
{
    static int minmax(int arr[],boolean b)
    {
        int max=0;
        int min=99999;
        for(int i=0;i<arr.length;i++)
        {
            max=max+arr[i];
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        if(b)
        {
            return max;
        }
        else
        {
            return min;
        }
    }
    static int sweetness(int arr[],int k)
    {
        int max=minmax(arr,true);
        int min=minmax(arr,false);
        if(k>arr.length)
        {
            return -1;
        }
        else if(k==arr.length)
        {
            return min;
        }
        else
        { 
            while(min<max)
            {
            int mid=min+(max-min)/2;
            int sum=0;
            int cnt=0;
            for(int i=0;i<arr.length;i++)
            {
                if(sum+arr[i]>mid)
                {
                    sum=arr[i];
                    cnt++;
                }
                sum=sum+arr[i];
            }
            if(cnt<=k)
            {
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
            }   
        }
        return min;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Enter the number of your friends=");
        int k=sc.nextInt();
        System.out.println("Minimum sweetnes="+sweetness(arr,k+1));
    }
}