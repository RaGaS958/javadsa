import java.util.*;
class max_value_bound_array
{
   static int  sum(int a[])
   {
       int sum=0;
       for(int i=0;i<a.length;i++)
       sum=sum+a[i];
       return sum;
    }
    static boolean create(int a[],int maxsum,int index)
    {
      int k=1;
      int pro=1;
      do
      {
         pro=(k++)*a.length;
        }while(pro<maxsum);
      for(int i=0;i<a.length;i++)
      a[i]=k-1;
      
      int start=0;
      int end=a.length-1;
      while(start<index || end>index)
      {
          if(sum(a)==maxsum)
          {
          if((index<a.length-3) &&(a[index+1]==a[index+2]))
          {
              a[index]+=1;
              a[index+2]-=1;
            }
            else if(index>2 && a[index-1]==a[index-2])
            {
                a[index]+=1;
                a[index-2]-=1;
              }
              else
              return true;
        }
        if(end>index)
        a[end--]=a[end]-1;
        if(end==index)
        a[start++]=+1;
        }
        
         
     return false; 
        }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of array= ");
            int n=sc.nextInt();
            System.out.print("Enter the max sum=");
            int maxsum=sc.nextInt();
            System.out.print("Enter the index=");
            int index=sc.nextInt();
            int [] a=new int[n];
            if(create(a,maxsum,index))
            System.out.println(a[index]);
            else
            System.out.println(Arrays.toString(a));
        
     }
    }