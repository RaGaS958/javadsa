import java.util.*;
class maximum_population_year
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int j,i;
        System.out.print("Enter the numbers of log=");
        int l=sc.nextInt();
        int n=l*2;
        int [][] log=new int[l][2];
        System.out.println("Fill the log(birth,death):-");
        for(i=0;i<l;i++)
        for(j=0;j<2;j++)
        log[i][j]=sc.nextInt();
        int [][] d=new int[l][2];
        for(i=0;i<l;i++)
        d[i][0]=+1;
        d[0][1]=log[0][0];
        d[l-1][1]=log[l-1][0];
         for(i=1;i<l-1;i++)
         {
         if(log[i-1][1]-log[i][0]>0) 
         {
         d[i][0]=d[i][0]+1;
         d[i][1]=log[i][0];
        }
    }
    int max=0;
    for( i=0;i<l;i++)
    {
        if(d[i][0]>max)
        max=d[i][0];
    }
    int min=100000000;
    for(i=0;i<l;i++)
    {
        if(d[i][0]==max)
        if(d[i][1]<min)
        min=d[i][1];
    }
    System.out.println("Earliest year with maximum population="+min);
 }
}
          