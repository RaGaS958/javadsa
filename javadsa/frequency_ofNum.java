import java.util.*;
class frequency_ofNum
{
    static int freq(int arr[],int k)
    {
        int point1=arr.length-1;
        int point2=arr.length-2;
       int  counter=1;
        int temp=0;
        int max=0;
        while(point1>0)
        {
          temp =k;  
          int temp1=arr[point2];
        while (temp>=0 && point2>=0)
        {
            if(arr[point1]==temp1)
            {
            ++counter;
            if(point2==0)
            break;
            else
            temp1=arr[--point2];
            }
            else
            {
                ++temp1;
                --temp;
            }
        }
            if(counter>max)
            max=counter;
            counter=1;
            point2=(--point1)-1;
        }
        return max;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.print("Enter the elements in array:-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Enter the number of operations=");
        int k=sc.nextInt();
        System.out.println("Max frequency="+freq(arr,k));
    }
}
    