import java.util.*;
class items_matching_rule
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String rulekey,rulevalue;
        int choice,pos=0;
        System.out.print("Enter the numbers of items(type,color,brand)=");
        int n=sc.nextInt();
        String [][] a=new String[n][3];
        System.out.println("Enter the items:-");
        for(int i=0;i<n;i++)
        for(int j=0;j<3;j++)
        a[i][j]=sc.nextLine();
        System.out.print("Enter the type of characterization(type,color,brand)=");
        rulekey=sc.nextLine();
        System.out.println();
        System.out.print("Enter the characterization details=");
        rulevalue=sc.nextLine();
        System.out.println();
        if(rulekey=="type")
        choice=0;
        else if(rulekey=="color")
        choice=1;
        else
        choice=2;
        for(int i=0;i<n;i++)
        if(a[i][choice]==rulevalue)
        pos=i;
        System.out.println("AS per your choice items are:-");
        for(int i=0;i<3;i++)
        System.out.print(a[pos][i]);
        System.out.println();
    }
}