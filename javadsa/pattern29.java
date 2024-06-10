import java.util.*;
 class pattern29
{    
public static void main()   
{    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int row=sc.nextInt();
        System.out.println(); 
int i, j;       
for (i=0; i<row; i++)   
{        
for (j=row-i; j>1; j--)   
{   
System.out.print(" ");   
}    
for (j=0; j<=i; j++ )   
{         
System.out.print(row-i+" ");   
}    
System.out.println();   
}   
}   
} 