import java.util.*;
class sub_array_minmax_sum // important must visit again
{
      static int split(int a[],int m)
      {
          int start=0;
          int end=0;
          for( int i=0;i<a.length;i++)
          {
              start=Math.max(start,a[i]);
              end=end+a[i];
            }
           int sum=0;
          int parts=1;
          while(start<end)
          {
             int  mid=start+(end-start)/2;
              for( int i=0;i<a.length;i++)
              {
              
              if(sum+a[i]>mid)
              {
                  sum=a[i];
                  parts++;
                }
                else
                sum=sum+a[i];
            }
            if(parts>m)
            start=mid+1;
            else
            end=mid;
            }
            return end;
        }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Size of array=");
            int n=sc.nextInt();
            int [] a=new int[n];
            System.out.println("Enter the elements in array:-");
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            System.out.print("enter the splits number=");
            int m=sc.nextInt();
            System.out.println("Minimized max sum="+split(a,m));
        }
        }