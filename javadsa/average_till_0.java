import java.util.*;
class average_till_0
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:-");
        int count=0;
        double sum=0,n=0,avg;
        do
        {
            n=sc.nextDouble();
            sum=sum+n;
            count++;
        }while(n!=0);
        avg=sum/(count-1);
        System.out.println("Average="+avg);
    }
}