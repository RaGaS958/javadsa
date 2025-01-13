import java.util.*;
class smaller_self
{
    static void arrayyy(int arr[])
    {
        int c=0;
        while(c<arr.length)
        {
            int temp=arr[c];
            arr[c]=0;
        for(int i=c+1;i<arr.length;i++)
        {
            if(arr[i]<temp)
            arr[c]+=1;
        }
        c++;
    }
   }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements in array:-");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        arrayyy(arr);
        System.out.println("Result= "+Arrays.toString(arr));
    }
}