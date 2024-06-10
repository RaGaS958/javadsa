import java.util.*;
class sum_product_diff_digits
{
    public static void main()
{
   Scanner sc=new Scanner (System.in);
   System.out.print("Enter the Number=");
   int n=sc.nextInt();
   System.out.println();
   int r,sum=0,pro=1,diff=0;
   while(n>0)
  {
    r=n%10;
    sum=sum+r;
    pro=pro*r;
    n=n/10;
  }
  System.out.println("Diff of sum and product of digit of entered number="+Math.abs(pro-sum));
  } 
}