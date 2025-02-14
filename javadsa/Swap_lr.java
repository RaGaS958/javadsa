import java.util.*;
class Swap_lr
{
    static boolean check(String start,String result)
    {
    StringBuilder s=new StringBuilder();
    int n=start.length();
        int st=0;
        int en=n-1;
    while(st<en)
     {
         char ch1=start.charAt(st);
         char ch2=start.charAt(en);
         if(ch1=='R')
         {
             if(start.charAt(st+1)=='X')
             {
                 start=start.substring(0,st)+"XR"+start.substring(st+2,n);
                 st+=2;
                }
                 else
             {
                 start=start.substring(0,st)+"R"+start.substring(st+1,n);
                 st+=1;
            }
            }
          else if(ch1=='X')
          {
              if(start.charAt(st+1)=='L')
              {
                  start=start.substring(0,st)+"LX"+start.substring(st+2,n);
                  st+=2;
                }
                else
             {
                 start=start.substring(0,st)+"X"+start.substring(st+1,n);
                 st+=1;
            }
        }
            if(ch2=='L')
         {
             if(start.charAt(en-1)=='X')
             {
                 start=start.substring(0,en-1)+"LX"+start.substring(en,n);
                 en-=2;
                }
                else
             {
                 start=start.substring(0,en)+"L"+start.substring(en,n);
                 en-=1;
             
            }
        }
          else if(ch2=='X')
          {
              if(start.charAt(en-1)=='R')
              {
                  start=start.substring(0,en-1)+"XR"+start.substring(en,n);
                  en-=2;
                }
             else
             {
                 start=start.substring(0,en)+"X"+start.substring(en,n);
                 en-=1;
                }
            }
            System.out.println(start);
      }
    if(start.equals(result))
    return true;
    else
    return false;
}
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start=");
        String start=sc.next();
        System.out.print("Enter the result=");
        String result=sc.next();
        System.out.println("Result is equivalent to start="+check(start,result));
    }
}