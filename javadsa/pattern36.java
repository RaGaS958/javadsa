import java.util.*;
class pattern36
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.println(); 
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=n-i;j>1;j--)
            System.out.print(" ");
            for(j=0;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }      
        for (i=0; i<n; i++)   
      {        
        for (j=i; j>=1; j--)     
         System.out.print(" ");            
        for (j=n-i; j>0; j-- )          
       System.out.print("* ");       
        System.out.println();   
        }   
    }   
} 
    