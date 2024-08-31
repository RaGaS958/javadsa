import java.util.*;
class count_negative_sorted
{
    static int  count(int a[][])
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            int start=0;
            int end=a[i].length-1;
            int pos=0;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(a[i][start]<0)
                {
                    break;
                }
                else if(a[i][mid]>=0)
                start=mid+1;
                else if(mid>start && a[i][mid]<0)
                start=mid;
                else
                break;   
            }
            count=count+(end-start+1);
            
        }
        return count;
   
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the elements in matrix:-");
        int [][] a=new int[n][m];
         for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
         a[i][j]=sc.nextInt();
        System.out.println("Number of negatives are:-"+count(a));
        }
    }