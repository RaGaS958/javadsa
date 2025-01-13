import java.util.*;
class round_off
{
    public static void main(String args[])
    {
        double num=564.676544;
        double round=Math.round((num*100));
        round/=100;
        System.out.println(round);
        
}
}