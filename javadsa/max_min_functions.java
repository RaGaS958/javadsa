import java.util.*;
class max_min_functions
{
    static double max(double a,double b,double c)
    {
        if(a>b){
        if(a>c)
        return a;
        else
        return c;}
        else{
        if(b>c)
        return b;
        else
        return c;
    }
    }
        static double min(double a,double b,double c)
    {
        if(a<b){
        if(a<c)
        return a;
        else
        return c;}
        else{
        if(b<c)
        return b;
        else
        return c;
    }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:-");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double maxx=max(a,b,c);
        double minn=min(a,b,c);
        System.out.println("Max number="+maxx+"\nMin  number="+minn);
    }
}