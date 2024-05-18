import java.util.*;

class Circle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle-");
        double r= sc.nextDouble();
        double perimeter=2*(Math.PI)*r;
        double area=(Math.PI)*Math.pow(r, 2);
        System.out.println("Perimeter of the Circle is " + perimeter);
        System.out.println("Area of the Circle is " + area);
    }
}
