import java.util.*;
class Next_great
{
     static int greater(int n)
     {
         int temp=n;
         int c=0;
         while(temp>0)
         {
             ++c;
             temp=temp/10;
            }
        int arr[]=new int[c];
        temp=n;
        int i=0;
         while(temp>0)
         { 
             arr[i++]=temp%10;
             temp=temp/10;
            }
            for( i=0;i<c-1;i++)
            {
                for(int j=0;j<c-i-1;j++)
                {
                    if(arr[j]<arr[j+1])
                    {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
                }
           }
           int num=0;
           for(i=0;i<c;i++)
           {
               num=(num*10)+arr[i];
            }
            if(num==n)
            return -1;
            else
            return num;
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the integer=");
    int n=sc.nextInt();
    System.out.println("Greatest integer = "+greater(n));
}
}