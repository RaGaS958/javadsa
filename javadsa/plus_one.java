import java.util.*;
class plus_one
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int r=0,c=0,temp;
        System.out.print("Enter the size of number=");
        int n=sc.nextInt();
        System.out.println("Enter the digits:-");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        r=(10*r)+a[i];
        r=r+1;
        temp=r;
         while(temp>0)
         {
             temp=temp/10;
             c++;
            }
            int [] b=new int[c];
            for(int i=0;i<c;i++)
            {
                b[c-i-1]=r%10;
                r=r/10;
            }
            System.out.println("Integer after plus one:-"+Arrays.toString(b));
        }
    }
                