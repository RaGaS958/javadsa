import java.util.*;
class adding_sub_multi_div_array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of two Array=");
        int n=sc.nextInt();
        System.out.println();
        int [] a=new int[n];
        int [] b=new int[n];
        System.out.println("Enter the elements of first array:-");
         for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        System.out.println("Enter the elements of Second arrya:-");
          for(int i=0;i<n;i++)
         b[i]=sc.nextInt();
        System.out.print("summed array=");
        for(int i=0;i<n;i++)
        a[i]=a[i]+b[i];
         System.out.println(Arrays.toString(a));
         System.out.print("Subtrated array=");
        for(int i=0;i<n;i++)
        a[i]=(a[i]-b[i])-b[i];     
        System.out.println(Arrays.toString(a));
        System.out.print("multiplied array=");
          for(int i=0;i<n;i++)
        a[i]=(a[i]+b[i])*b[i];
        System.out.println(Arrays.toString(a));
        System.out.print("Divded array=");
        for(int i=0;i<n;i++)
        a[i]=(a[i]/b[i])/b[i];
        System.out.println(Arrays.toString(a));
    }
}
        
        
