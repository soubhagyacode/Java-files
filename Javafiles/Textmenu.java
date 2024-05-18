import java.util.*;

abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape{
    double r;
    Circle(double radius)
    {
        this.r=radius;
    }
    double perimeter()
    {
        return 2*Math.PI*r;

    }
    double area()
    {
        return Math.PI*r*r;

    }
}
class Rectangle extends Shape{
    double len,bth;
    Rectangle(double length,double breadth)
    {
        len=length;
        bth=breadth;
    }
    double perimeter()
    {
        return 2*(len+bth);

    }
    double area()
    {
        return len*bth;

    }
}
class Square extends Shape{
    double s;
    Square(double side)
    {
        this.s=side;
    }
    double perimeter()
    {
        return 4*s;

    }
    double area()
    {
        return s*s;

    }
}
class Triangle extends Shape{
    double b,h;
    Triangle(double base, double height)
    {
        this.b=base;
        this.h=height;
    }
    double perimeter()
    {
        double hypotnuese=b*b+h*h;
        return b+h+Math.sqrt(hypotnuese);

    }
    double area()
    {
        return 0.5*b*h;

    }
}
public class Textmenu {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Text-based menu to Calc Area and Peri:"+
        "\n a Circle with radius 'r' Press 1"+
        "\n a Rectangle with length and breadth Press 2"+
        "\n a Square with side s Press 3"+
        "\n a Right angled Triangle Press 4");
        int choice= sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter radius:");
            double r= sc.nextDouble();
            Circle c = new Circle(r);
            System.out.println("Perimeter= "+c.perimeter()+ " Area= "+c.area());
            break;

            case 2:
            System.out.println("Enter length:");
            double l= sc.nextDouble();
            System.out.println("Enter breath:");
            double b= sc.nextDouble();

            Rectangle rec = new Rectangle(l,b);
            System.out.println("Perimeter= "+rec.perimeter() + " Area= "+rec.area());
            break;

            case 3:
            System.out.println("Enter side of the square:");
            double s= sc.nextDouble();
            Square sq = new Square(s);
            System.out.println("Perimeter= "+sq.perimeter()+ " Area= "+sq.area());
            break;

            case 4:
            System.out.println("Enter base of right angled triangle: ");
            double base= sc.nextDouble();
            System.out.println("Enter height of right angled triangle: ");
            double h= sc.nextDouble();
            Triangle rt = new Triangle(base,h);
            System.out.println("Perimeter= "+rt.perimeter()+ " Area= "+rt.area());
            break;

            default:
            System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
}
