import java.util.*;
class postive_and_negative
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Zero is entered");
        else if(n>0)
             System.out.println("postive Number");
        else
        System.out.println("negative number");
    }
}