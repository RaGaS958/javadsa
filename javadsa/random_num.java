import java.util.*;
class random_num
{
    public static void main()
    {
        int min=0;
        int max=10;
        int a=(int)(Math.random()*((max-min)+1))+1;
        System.out.println(a);
    }
}