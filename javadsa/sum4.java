import java.util.*;
class sum4
{
    static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void sort(int arr[])
    {
        boolean cond=true;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                swap(arr,j,j-1);
                 }
                 else
                 { 
                     break;
                    }
            }
        }
    }
    static void sum(int arr[],int k)
    {
        int sum=0;
        System.out.println("Sub arrays:- ");
        for(int i=0;i<arr.length;i++)
        {
            int a=arr[i];
            int b=arr[(i+1)%arr.length];
            int c=arr[(i+2)%arr.length];
            int d=arr[(i+3)%arr.length];
            if(a+b+c+d==k)
            {
                System.out.printf("[%d,%d,%d,%d] ",a,b,c,d);
            }
        }
        System.out.println();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements is array:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String cond="Y";
        while(cond.equals("Y"))
        {
        System.out.print("Enter the target=");
        int k=sc.nextInt();
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sum(arr,k);
        cond=sc.next();
        }
        }
    }
