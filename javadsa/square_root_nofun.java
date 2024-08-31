import java.util.*;
class square_root_nofun
{
    static int check(int a[][],int target)
    {
       for(int i=0;i<a.length-1;i++)
       {
           if(target==a[i][0])
           return a[i][1];
           if(target==a[i+1][0])
           return a[i+1][1];
           if(target<a[i+1][0] && target >a[i][0])
           return a[i][1];
        }
        return 1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println();
          int [][] a=new int[n][2];
          for(int i=1;i<n;i++)
              {
                  a[i-1][0]=i*i;
                   a[i-1][1]=i;
                }
               System.out.println("Square root="+check(a,n));
        }
    }
      