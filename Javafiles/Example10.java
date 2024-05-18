import java.util.Scanner;

class Example10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle-");
        double r= sc.nextDouble();
        Circle2 c= new Circle2(r);
        c.Area();
        c.Perimeter();
        System.out.println("Number of Instance = " + c.getInstance());
        sc.close();
    }
}

class Circle2 {
    double r;
    int count=0;
    final double PI=3.14;

    Circle2(double radius)
    {
        this.r=radius;
        count++;
    }
    int getInstance()
    {
        return count;
    }
    void Area()
    {
        double area=(PI)*Math.pow(r, 2);
        System.out.println("Area of the Circle is " + area);
    }
    void Perimeter()
    {
        double perimeter=2*(PI)*r;
        System.out.println("Perimeter of the Circle is " + perimeter);
    }
}