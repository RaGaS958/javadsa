import java.util.*;
class Reverse_string3
{
  static String reverse(String s)
  {
      StringBuilder ss=new StringBuilder();
      int st=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          { 
              for(int j=i;j>=st;j--)
              {
                  ss.append(s.charAt(j));
                  
                }
                st=i+1;
              
            }
        }
      
      return ss.toString().trim();
    }
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the String:-");
       String s=sc.nextLine();
       System.out.println("Reverse String:- "+reverse(s+" "));
    }     
    }
