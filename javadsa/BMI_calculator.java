import java.util.*;
class BMI_calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Weight in kg=");
        double w=sc.nextDouble();
        System.out.println();
        System.out.print("Enter the Height in cm=");
        double h=sc.nextDouble();
        System.out.println();
        double bmi=(w*10000)/(h*h);
        System.out.println("Your BMI ="+bmi+"and you are");
        if(bmi<=18.4)
        System.out.print("underweight");
        else if(bmi>18.4 && bmi<25)
        System.out.print("normal");
        else if (bmi>24.9 && bmi<40)
        System.out.print("overweight");
        else
        System.out.print("obese");
        System.out.println();
    }
}
