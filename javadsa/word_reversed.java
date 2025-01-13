import java.util.*;
class word_reversed
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the word:-");
         String w=sc.nextLine();
         String word="";
         String rev="";
         w=w+" ";
         int l=w.length();
         for(int i=0;i<l;i++)
         {
            char ch=w.charAt(i);
             if(ch!=' ')
             {
                 word=word+ch;
                }
                else
                {
                rev=" "+word+rev;
                word="";
                }
            }
            System.out.println(rev.trim());
        }
    }