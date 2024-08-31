import java.util.*;
class combination_of3
{
    static void comb(int a[])
    {
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        for(int k=0;k<3;k++)
        System.out.println((a[i]*100)+(a[j]*10)+a[k]);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three digits:-");
        int a[]=new int[3];
        for(int i=0;i<3;i++)
        a[i]=sc.nextInt();
        comb(a);
    }
}