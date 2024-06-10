import java.util.*;
class electricity_bill
{
    public static void main(int unit)
    {
        double pay_bill=0;
        if(unit<=100)
        pay_bill=unit*1.8;
        else if(unit>100 && unit<=200)
        pay_bill=(100*1.8)+((unit-100)*2);
        else if(unit>200 && unit<=300)
        pay_bill=(100*1.8)+(200*2)+((unit-200)*2.8);
        else if(unit>300 && unit<=400)
        pay_bill=(100*1.8)+(200*2)+(300*2.8)+((unit-300)*3.6);
        else if(unit>400 && unit<=500)
        pay_bill=(100*1.8)+(200*2)+(300*2.8)+(400*3.6)+((unit-400)*4.8);
        else if(unit>500 && unit<=600)
        pay_bill=(100*1.8)+(200*2)+(300*2.8)+(400*3.6)+(500*4.8)+((unit-500)*5.2);
        else 
        pay_bill=(100*1.8)+(200*2)+(300*2.8)+(400*3.6)+(500*4.8)+(600*5.2)+((unit-600)*6);
    System.out.print("Electricity bill ="+pay_bill+"\n");
}
}