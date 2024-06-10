import java.util.*;
class day_month_switch
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day of the weekend=");
        int day=sc.nextInt();
        System.out.println();
        System.out.print("Enter the month of the year=");
        int month=sc.nextInt();
        System.out.println();
        switch(day)
        {
            case 1:System.out.print("Monday ");break;
            case 2:System.out.print("Tuesday "); break;
            case 3:System.out.print("Wednesday ");break;
            case 4:System.out.print("Thursday ");break;
            case 5:System.out.print("Friday ");break;
            case 6:System.out.print("Satureday ");break;
            case 7:System.out.print("Sunday ");break;
            default:System.out.print("Invalid ");
        }
               switch(month)
        {
            case 1:System.out.println("January");break;
            case 2:System.out.println("ferburay"); break;
            case 3:System.out.println("march");break;
            case 4:System.out.println("april");break;
            case 5:System.out.println("may");break;
            case 6:System.out.println("june");break;
            case 7:System.out.println("july");break;
            case 8:System.out.println("august");break;
            case 9:System.out.println("september"); break;
            case 10:System.out.println("october");break;
            case 11:System.out.println("november");break;
            case 12:System.out.println("december");break;
            default:System.out.println("Invalid");
        }
        
    }
}