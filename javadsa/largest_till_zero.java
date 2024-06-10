import java.util.*;
class largest_till_zero
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:-");
        int l=0;int n;
          do
          {
              n=sc.nextInt();
              if(n>l)
              l=n;
              else if(n==l)
              l=n;
            }while(n!=0);
            System.out.println("Largest number="+l);
        }
    }