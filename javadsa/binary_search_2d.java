import java.util.*;
class binary_search_2d
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:-");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a=new int [n][m];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Enter the target:-");
        int target=sc.nextInt();
        boolean test=true;
        for(int i=0;i<n;i++)
        {
            if(a[i][0]>a[i][m-1])
            test=check(a,target,i);
            else
            test=check1(a,target,i);
            if(test)
            break;
        }
        if(test)
        System.out.println("Target found");
        else
        System.out.println("Target not found");
    }

    static boolean check1(int a[][],int target,int i)
    {
        int mid =0;
        int start=0;
        int end=a[i].length-1;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[i][mid]<target)
            start=mid+1;
            else if(a[i][mid]>target)
            end=mid-1;
            else if(target==a[i][mid])
            return true;
        }
        return false;
    }
      static boolean check(int a[][],int target,int i)
    {
        int mid =0;
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(a[i][mid]<target)
            end=mid-1;
            else if(a[i][mid]>target)
            start=mid+1;
            else if(target==a[i][mid])
            return true;
        }
        return false;
    }
    }

        
