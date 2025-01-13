import java.util.*;
class local_rent_travel
{
    static int search(String ar[],String s,String e,boolean b)
    {   
        if(b)
        {
        int start=-2;
        
        for(int i=0;i<ar.length;i++)
        {
          if(ar[i].equals(s))
          {
          start=i;
          break;       
          }
        }
        return start;
    }
        else
        {
         int end=-2;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i].equals(e))
            {
            end=i;
            break;
           }
        }
        return end;
       }
}
    static int costCalc(int ar[],int s,int e)
    {   
        int totalCost=0;
        if(s<=e)
        {
        for(int i=s+1;i<=e;i++)
         totalCost=totalCost+ar[i];
        }
        else
        {
        for(int i=e+1;i<=s;i++)
        totalCost=totalCost+ar[i];
        }
        int gst=10;
        int costAfterGst=totalCost+((totalCost*gst)/100);
        if(e-s>2)
        costAfterGst-=((costAfterGst*20)/100);
        return costAfterGst;
    }
    
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("***********************************************WELCOME USER***********************************************");
    System.out.print("Enter the number of stops=");
    int stops=sc.nextInt();
    String storeStop[]=new String[stops];
    int storeRent[]=new int[stops];
    System.out.println("Enter each stop from starting point to Ending point with cost of rent from nearest stop:-");
    for(int i=0;i<stops;i++)
    {
      storeStop[i]=sc.next().toUpperCase();
      storeRent[i]=sc.nextInt();
    }
    String cond="YES";
    do
    {   if(cond.equals("YES"))
        {
        System.out.print("Enter the Starting point:-");
        String start=sc.next().toUpperCase();
        System.out.print("Enter the Destination stop:-");
        String end=sc.next().toUpperCase();
        int startIndex=search(storeStop,start,end,true);
        int endIndex=search(storeStop,start,end,false);
        if(startIndex==-2 || endIndex==-2)
        {
               System.out.println("Wrong Input !!!!!");
          
        }
        else
        {
           int payRent=costCalc(storeRent,startIndex,endIndex);
            System.out.println("Total rent to Travel from "+start+" To "+end+" = "+payRent);
        }
    }
    else if(!(cond.equals("NO") || cond.equals("YES")))
    System.out.println("Wrong input,try again");
    System.out.print("Want to try again? Yes or No:-");
    cond=sc.next().toUpperCase();
    }while(!cond.equals("NO"));
    System.out.println("************************************************THANKYOU**************************************************");
  }
}
