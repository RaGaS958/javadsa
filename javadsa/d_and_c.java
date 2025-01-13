import java.util.*;
class d_and_c
{
    static int sum(int arr[],int pos)
    {
        if (pos==arr.length)
        return 0;
        else
        return arr[pos]+sum(arr,++pos);
    }
    static int count(int arr[],int pos)
    {
        if(pos==arr.length)
        return 0;
        else
        return 1+count(arr,++pos);
    }
    static int max(int arr[],int pos,int max)
    {
        if(pos==arr.length)
        return max;
        else
        {
        if (max<arr[pos])
        return max(arr,pos,arr[pos++]);
        else
        return max(arr,++pos,max);
        }
    }
    public static void main()
    {
        int arr[]={3,4,2,1};
        int sum=sum(arr,0);
        int count=count(arr,0);
        int max=max(arr,0,0);
        System.out.println("Sum="+sum+"\nCount="+count+"\nMAx="+max);
    }
}
    