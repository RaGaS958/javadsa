import java.util.*;
class holiday
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        System.out.println("**********************THE HOLIDAY PLANNER***********************");
        do
        {
        System.out.print("* Enter the Month= ");
        String m=sc.next();
        String s=m.toUpperCase();
        System.out.print("* Enter the date=");
        int n=sc.nextInt();
       boolean c=true;
       int flag=0;
        switch(s)
        {
            
            case "JANUARY":
            {
                if(n>=1 && n<=31)
                {
                if(n==1 || n==6 || n==14 ||n==26)
                {
                    flag++;
                    if(n==1)
                    System.out.println("* NEW YEAR");
                    if(n==6)
                    System.out.println("* GURU GOVIND JAYANTI ");
                    if(n==14)
                    System.out.println("* HAZARAT ALI'S BIRTHDAYS \nPONGAL \nMAKAR SANKRANTI");
                    if(n==26)
                    System.out.println("* REPUBLIC DAY");
                }
                if (n==5 || n==12 || n== 19 || n==26)
                {
                System.out.println("* Sunday");
                flag++;
                }
                if( flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "FEBRUARY":
            {
                if(n>=1 && n<=28)
                {
                if (n==2 || n==9 || n== 16 || n==23)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                 if(n==2 || n==12 ||n==19 || n==23 || n==26)
                {
                    flag++;
                    if(n==2)
                    System.out.println("* VASANT PANCHAMI");
                    if(n==12)
                    System.out.println("* GURU RAVIADAS JAYANTI");
                     if(n==19)
                    System.out.println("* SHIVAJI JAYANTI");
                     if(n==23)
                    System.out.println("* MAHARISHI DAYANAND SARASWATI JAYANTI");
                    if(n==26)
                    System.out.println("* MAHA SHIVARATRI");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "MARCH":
            {
                if(n>=1 && n<=31)
                {
                if (n==2 || n==9 || n== 16 || n==23 || n==30)
                {
                    flag++;
                System.out.println("* Sunday");
            }
                if(n==2 || n==14 ||n==13 || n==28 || n==30 ||n== 31)
                {
                    flag++;
                    if(n==2)
                    System.out.println("* RAMADAN START");
                    if(n==14)
                    System.out.println("* HOLI");
                    if(n==13)
                    System.out.println("* HOLIKA DAHANA");
                     if(n==28)
                    System.out.println("* JAMAT UL-VIDA");
                     if(n==30)
                    System.out.println("* CHAITRA SUKHLADI \n* GUDI PADWA \n* UGADI");
                     if(n==31)
                    System.out.println("* RAMZAN ID");
                }
                
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "APRIL":
            {
                if(n>=1 && n<=30)
                {
                if (n==6 || n==13 || n== 20 || n==27)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                if(n==6 || n==10 ||n==13 || n==14 || n==15 || n== 18 ||n==20)
                {
                    flag++;
                    if(n==6)
                    System.out.println("* RAMA NAVAMI");
                    if(n==10)
                    System.out.println("* MAHAVIR JAYANTI");
                    if(n==13)
                    System.out.println("* VAISAKHI");
                    if(n==14)
                    System.out.println("* AMBEDKAR JAYANTI \nMESADI");
                    if(n==15)
                    System.out.println("* VAISAKHADI");
                    if(n==18)
                    System.out.println("* GOOD FRIDAY");
                    if(n==20)
                    System.out.println("* EASTER DAY");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "MAY":
            {
                if(n>=1 && n<=31)
                {
                if (n==4 || n==11 || n== 18 || n==25)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                if(n==9 || n==12)
                {
                    flag++;
                    if(n==9)
                    System.out.println("* BIRTHDAY OF RABINDRANATH");
                    if(n==12)
                    System.out.println("* BUDDHA PURNIMA");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "JUNE":
            {
                if(n>=1 && n<=30)
                {
                if (n==1 || n==8 || n== 15 || n==22 || n==29)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                 if(n==7 || n==27)
                {
                    flag++;
                    if(n==7)
                    System.out.println("* BAKRID");
                    if(n==27)
                    System.out.println("* RATH YATRA");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
            }
              case "JULY":
            {
                if(n>=1 && n<=31)
                {
                if (n==6 || n==13 || n== 20 || n==27)
                {
                    flag++;
                System.out.println("* Sunday");
            }
                if(n==6)
                {
                    flag++;
                    System.out.println("* MUHARRAM");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "AUGUST":
            {
                if(n>=1 && n<=31)
                {
                if (n==3 || n==10 || n== 17 || n==24 || n==31)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                 if(n==9 || n==15 || n==16 || n==27)
                {
                    flag++;
                    if(n==9)
                    System.out.println("* RAKHSA BANDHAN");
                    if(n==15)
                    System.out.println("* INDEPENDENCE DAY \n* JANMASHTAMI(SMARTA) \n* PARSI NEW YEAR");
                    if(n==16)
                    System.out.println("* JANMASHTAMI");
                    if(n==27)
                    System.out.println("* GANESH CHATURTHI");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "SEPTEMBER":
            {
                if(n>=1 && n<=30)
                {
                if (n==7 || n==14 || n== 21 || n==28)
                {
                    flag++;
                System.out.println("* Sunday");
            }
                if(n==5 || n==22 ||n==28 || n==29 ||n==30)
                {
                    flag++;
                    if(n==5)
                    System.out.println("* ONAM \nMILAD UN-NABI");
                    if(n==22)
                    System.out.println("* FIRST DAY OF SHARAD NAVRATRI");
                    if(n==28)
                    System.out.println("* FIRST DAY OF DURGA PUJA FESTIVIES");
                    if(n==29)
                    System.out.println("* MAHA SAPTAMI");
                    if(n==30)
                    System.out.println("* MAHA ASHTAMI");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "OCTOBER":
            {
                if(n>=1 && n<=31)
                {
                if (n==5 || n==12 || n== 19 || n==26)
                {
                    flag++;
                System.out.println("* Sunday");
            }
                if(n==1 || n==2 ||n==7 || n==10 || n==20 || n==22 || n==23 || n==28)
                {
                    flag++;
                    if(n==1)
                    System.out.println("* MAHA NAVAMI");
                    if(n==2)
                    System.out.println("* MAHATMA GANDHI JAYANTI \n* DUSSEHRA");
                    if(n==7)
                    System.out.println("* MAHARISHI VALMIKI JAYANTI");
                    if(n==10)
                    System.out.println("* KARAKA CHATURTHI");
                    if(n==20)
                    System.out.println("* DIWALI \n* NARAKA CHATURDASI");
                    if(n==22)
                    System.out.println("* GOVARDHAN PUJA");
                    if(n==23)
                    System.out.println("* BHAI DUJ");
                    if(n==28)
                    System.out.println("* CHHAT PUJA");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "NOVEMBER":
            {
                if(n>=1 && n<=30)
                {
                if (n==2 || n==9 || n== 16 || n==23 || n==30)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                if(n==5 || n==24)
                {
                    flag++;
                    if(n==5)
                    System.out.println("* GURU NANAK JAYANTI");
                    if(n==24)
                    System.out.println("* GURU TEGH BAHADUR'S MARTYRDOM DAY");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
              case "DECEMBER":
            {
                if(n>=1 && n<=31)
                {
                if (n==7 || n==14 || n== 21)
                {
                    flag++;
                System.out.println("* Sunday");
                }
                if(n==25)
                {
                    flag++;
                    System.out.println("* CHRISTMAS");
                }
                if(flag==0)
                System.out.println("* Working day");
                }
                else
                System.out.println("* Invalid date");
                break;
            }
            default:
            System.out.println("* Invalid Input");
        }
       
        do
        {
        System.out.print("* Want to recheck? yes or no:-");
        String cc=sc.next();
        if(cc.equals("yes"))
        {
        b=true;
        c=false;   
        }
        else if(cc.equals("no"))
        {
        b=false;
        c=false;
        }
        else
        {
            c=true;
        System.out.println("* Invalid input");
        }
       }while(c);
       flag=0;
    }while(b);
    System.out.println("****************************THE END*****************************");
    }
  }
