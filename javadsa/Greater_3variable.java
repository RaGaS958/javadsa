import java.util.*;
class Greater_3variable
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the 3 numbers=");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max;
    if(a>b)
    {
    if(a>c)
     max=a;
    else
    max=c;
    }
    else
    {
     if(b>c)
     max=b;
     else
     max=c;
    }
    System.out.println("Max="+max);
     }
   }

    
 