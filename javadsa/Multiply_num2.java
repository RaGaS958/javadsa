import java.util.*;
class Multiply_num2
{
    static int converter(String s)
    {
        int num=0;
        int n=s.length();
        int i=0;
        while(i<n)
        {
            int temp=s.charAt(i)-48;
            num=(num*10)+temp;
            i++;
        }
        return num;
    }
   static String multi(String num1,String num2)
   {
       int pro=0;
       StringBuilder s=new StringBuilder();
       int numb1=converter(num1);
       int numb2=converter(num2);
       pro=numb1*numb2;
       s.append(pro);
       return s.toString();
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num1=");
        String num1=sc.next();
        System.out.print("Enter the num2=");
        String num2=sc.next();
        System.out.printf("%s X %s = %s %n",num1,num2,multi(num1,num2));
    }
}