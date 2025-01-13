import java.util.*;
class median_2array
{
    static float median(int arr1[],int arr2[])
    {
        int min=0;
        int max=0;
        if(arr1[0]<arr2[0])
        {
        min=arr1[0];
        }
        else
        {
        min=arr2[0];
        }
        if(arr1[arr1.length-1]>arr2[arr2.length-1])
        max=arr1[arr1.length-1];
        else
        max=arr2[arr2.length-1];
        float median= (float)(min+max)/2;
        return median;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array=");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter the elements in First array:-");
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();
         System.out.print("Enter the size of Second array=");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter the elements in Second array:-");
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        System.out.println("Median ="+median(arr1,arr2));
    }
}