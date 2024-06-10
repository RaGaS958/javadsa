import java.util.*;
class shape_volume_area_perimeter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Shape code among the given list:-\n1.circle\n2.parellogram\n3.triangle\n4.cylinder\n5.cone\n6.sphere\n7.pyramid");
        String shape=sc.nextLine();
        switch(shape)
        {
            case "circle":
            System.out.println("Enter choice :-\n1.circumference\n2.area");
            String choice=sc.nextLine();
            System.out.print("Enter the radius=");
            double  r=sc.nextDouble();
            System.out.println();
            switch(choice)
            {
                case "circumference":
                double c=2*3.14*r;
                System.out.println("Circumferenc="+c);break;
                case "area":
                double a=3.14*(r*r);
                System.out.println("Area="+a);break;
                default:System.out.println("Invalid");
            }break;
            case "parellogram":
            System.out.println("Enter the specific parellogram:-\n1.square\n2.rectangle\n3.rhombus\n4.trapizium");
            String choice3=sc.nextLine();
            switch(choice3)
            {
                case "Square":
                System.out.println("Enter the choice:-\n1.perimeter\n2.area\n3.volume(cube)");
                String choice1=sc.nextLine();
                System.out.print("Enter the side of square=");
                double s=sc.nextDouble();
                System.out.println();
                switch(choice1)
                {
                    case "perimeter":
                    double p=4*s;
                    System.out.println("Perimeter"+p);break;
                    case "area":
                    double a=s*s;
                    System.out.println("Area="+a);break;
                    case"volume":
                    double volume=s*s*s;
                    System.out.println("Volume="+volume);break;
                    default: System.out.println("Invalid");
                }break;
                case "Rectangle":
                 System.out.println("Enter the choice:-\n1.perimeter\n2.area\n3.volume(cuboid)");
                String choice5=sc.nextLine();
                System.out.println("Enter the sides of rectangle=");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                switch(choice5)
                {
                    case "perimeter":
                    double p=2*(l+b);
                    System.out.println("Perimeter"+p);break;
                    case "area":
                    double a=l*b;
                    System.out.println("Area="+a);break;
                    case"volume":
                    double h=sc.nextDouble();
                    double volume=l*b*h;
                    System.out.println("Volume="+volume);break;
                    default: System.out.println("Invalid");;
                }break;
                case"Rhombus":
                 System.out.println("Enter the choice:-\n1.perimeter\n2.area");
                String choice8=sc.nextLine();
                switch(choice8)
                {
                    case "perimeter":
                    System.out.print("Enter side of rhombus=");
                    Double s1=sc.nextDouble();
                    System.out.println();
                    double p=4*s1;
                    System.out.println("Perimeter"+p);break;
                    case "area":
                      System.out.print("Enter the breath and height of  rhombus=");
                    Double b1=sc.nextDouble();
                    Double h=sc.nextDouble();
                    System.out.println();
                    double a=b1*h;;
                    System.out.println("Area="+a);break;
                    default: System.out.println("Invalid");;
                }break;
                case "Trapizium" :
                System.out.println("Enter the choice:-\n1.perimeter\n2.area");
                String choice10=sc.nextLine();
                switch(choice10)
                {
                    case "perimeter":
                System.out.print("Enter the sides of Trapizium=");
                double a=sc.nextDouble();
                double b2=sc.nextDouble();
                double c=sc.nextDouble();
                double d=sc.nextDouble();
                System.out.println();
                    double p=a+b2+c+d;
                    System.out.println("Perimeter"+p);break;
                    case "area":
                System.out.print("Enter the upper and lower side of Trapizium and height=");
                double a1=sc.nextDouble();
                double b3=sc.nextDouble();
                double h=sc.nextDouble();
                    double ar=(0.5)*(a1+b3)*h;
                    System.out.println("Area="+ar);break;
                    default: System.out.println("Invalid");
                }break;
                default: System.out.println("Invalid");
            }break;
            case "Triangle":
            System.out.println("Enter the type of triangle:-\n1.simple triangle\n2.isoceleus triangle\n3.Equilateral Triangle");
             String choice33=sc.nextLine();
             switch(choice33)
             {
                 case "simple triangle":
                 System.out.println("Enter the choice:-\n1.perimeter\n2.area");
                 String choice1=sc.nextLine();
                 switch(choice1)
                 {
                     case "perimeter":
                     System.out.println("Enter all sides=");
                     double a=sc.nextDouble();
                     double b=sc.nextDouble();
                     double c=sc.nextDouble();
                     double p=a+b+c;
                     System.out.println("Perimeter="+p);break;
                     case "area":
                     System.out.println("Enter the base and height=");
                     double b3=sc.nextDouble();
                     double h=sc.nextDouble();
                     double ar=0.5*h*b3;
                     System.out.println("Area="+ar);break;
                     default: System.out.println("Invalid");
                    }break;
                    case "isocelius triangle":
                 System.out.println("Enter the choice:-\n1.perimeter\n2.area");
                 String choice11=sc.nextLine();
                 switch(choice11)
                 {
                     case "perimeter":
                     System.out.println("Enter same and different side=");
                     double a=sc.nextDouble();
                     double b=sc.nextDouble();
                     double p=a+a+b;
                     System.out.println("Perimeter="+p);break;
                     case "area":
                     System.out.println("Enter the base and height=");
                     double b1=sc.nextDouble();
                     double h=sc.nextDouble();
                     double ar=0.5*h*b1;
                     System.out.println("Area="+ar);break;
                     default:System.out.println("Invalid");
                    }break;
                 case "Equilateral triangle":
                 System.out.println("Enter the choice:-\n1.perimeter\n2.area");
                 String choice13=sc.nextLine();
                 System.out.println("Enter the side=");
                 double a=sc.nextDouble();
                 switch(choice13)
                 {
                     case "perimeter":
                     double p=a*3;
                     System.out.println("Perimeter="+p);break;
                     case "area":
                     double ar=0.433*a*a;
                     System.out.println("Area="+ar);break;
                     default:System.out.println("Invalid");
                    }break;
                    default: System.out.println("Invalid");
                }break;
                case "cylinder":
                System.out.println("Enter the choice:-\n1.perimeter\n2.area\n3.volume");
                String choice44=sc.nextLine();
                switch(choice44)
                {
                    case "perimeter":
                System.out.println("Enter the height and radius =");
                double h=sc.nextDouble();
                double r4=sc.nextDouble();
                double p=(4*r4)+(2*h);
                System.out.println("Perimeter="+p);break;
                case "area":
                  System.out.println("Enter the height and radius =");
                double h4=sc.nextDouble();
                double r5=sc.nextDouble();
                double ar=(2*3.14*r5)*(h4+r5);
                System.out.println("Area="+ar);break;
                case "volume" :
                  System.out.println("Enter the height and radius =");
                double h6=sc.nextDouble();
                double r6=sc.nextDouble();
                double v=3.14*(r6*r6)*h6;
                System.out.println("Volume="+v);break;
                default: System.out.println("Invalid");
            }break;
            case "cone":
            System.out.println("Enter the choice:-\n1.perimeter\n2.area\n3.volume");
                String choice77=sc.nextLine();
                switch(choice77)
                {
                    case "perimeter":
                System.out.println("Enter the  radius =");
                double r77=sc.nextDouble();
                double p=2*3.14*r77;
                System.out.println("Perimeter="+p);break;
                case "area":
                System.out.println("Enter the height and radius =");
                double h=sc.nextDouble();
                double r88=sc.nextDouble();
                double ar=(3.14*r88)*(r88+Math.sqrt((h*h)+(r88*r88)));
                System.out.println("Area="+ar);break;
                case "volume" :
                  System.out.println("Enter the height and radius =");
                double h99=sc.nextDouble();
                double r99=sc.nextDouble();
                double v=0.942*h99*(r99*r99);
                System.out.println("Volume="+v);break;
                default:System.out.println("Invalid");
            }break;
            case "sphere":
            System.out.print("Enter the radius =");
            double r55=sc.nextDouble();
            System.out.println();
            double v=4.19*(r55*r55*r55);
            System.out.println("Volume="+v);
            break;
            case "pyramid":
            System.out.println("Enter the base length,base width and height=");
            double l=sc.nextDouble();
            double b=sc.nextDouble();
            double h=sc.nextDouble();
            double vo=0.3*l*b*h;
            System.out.println("Volume="+vo);
            break;
            default : System.out.println("Invalid");
        }
    }
}
        
            
                
                    
   