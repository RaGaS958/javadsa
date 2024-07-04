import java.util.*;
class deleting_same_sorted
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int temp=0;int c=0;int cc=0;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements in matrix:-");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        for(int j=0;j<n-1;j++)
        if(a[j+1]<a[j])
        {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
        for(int i=0;i<n-1;i++)
        {
        for(int j=i;j<n;j++)
        {
        if(a[i]==a[j+1])
        c++;
        else
        break;
        }
        for(int k=1;k<=c;k++)
        {
        a[i+k]=-10000000;
        i++;
        cc++;
        }
        c=0;
    }
      for(int i=0;i<n;i++)
      for(int j=0;j<n-1;j++)
      if(a[j]==-10000000)
      {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
    }
      System.out.print("[ "+a[0]);
    for(int i=1;i<n-cc;i++)
     System.out.print(" , "+a[i]);
     for(int i=0;i<cc;i++)
     System.out.print(", _ ");
     System.out.println("]");
  }
}