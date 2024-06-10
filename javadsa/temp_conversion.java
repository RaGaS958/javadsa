import java.util.*;
class temp_conversion
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter f for conversion of celcius to faherniet \nEnter c for conversion of faherneit to celcius");
        char choice=sc.next().charAt(0);
        if(choice=='f')
        {
            System.out.print("Enter the temperature=");
            int c=sc.nextInt();
            System.out.println();
            double conversion=(c*(9/5))+32;
            System.out.println("Converted temp="+conversion);
        }
        else if(choice=='c')
        {
            System.out.print("Enter the temperature=");
            int f=sc.nextInt();
            System.out.println();
            double conversion=(f*(0.56))+17.78;
            System.out.println("Converted temp="+conversion);
        }
        else 
        {
            System.out.println("Wrong choice");
        }
    }
}