
class butterfly_pattern
{
    public static void main()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            System.out.print("*");
            for(int k=i;k<n-2;k++)
            System.out.print(" ");
             for(int w=0;w<=i;w++)
            System.out.print("*");
            System.out.println();
            
        }
    }
}