import java.util.*;
class count_item_matching
{
    static int match(String arr[][],String key,String value)
    {
        int result =0;
        int Start=0;
        if(key.equals("color"))
        {
            Start=1;
        }
        else if(key.equals("name")) 
        {
            Start=2;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][Start].equals(value))
            {
                result++;
            }
        }
        return result;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items=");
        int n=sc.nextInt();
        String arr[][]=new String[n][3];
        System.out.println("Enter type ,color and name of each:-");
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.next();
            arr[i][1]=sc.next();
            arr[i][2]=sc.next();
        }
        String con="YES";
        while(con.equals("YES"))
        {
            System.out.print("Enter the key=");
            String key=sc.next();
            if(!(key.equals("type") || key.equals("color") || key.equals("name")))
            {
                System.out.println("Wrong choice");
            }
            else
            {
                System.out.print("Enter the value=");
                String value=sc.next();
                System.out.printf("Numbers of items matched= %d %n",match(arr,key,value));
            }
            System.out.print("Want to try again??? YES or No:-");
            con=sc.next();
        }
    }
}
