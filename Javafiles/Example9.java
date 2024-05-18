import java.util.Scanner;

class SimpleMath
{
    public static int arithmeticop(int a, int b)
    {
        return a+b;
    }
    public static int arithmrticop(int a, int b, int c)
    {
        return a-b;
    }
    public static int arithmeticop(int a, int b, int c, int d)
    {
        return a*b;
    }
    public static double arithmeticop(double a, double b)
    {
        if(b!=0)
        {
            return a/b;
        }
        else{
            System.out.println("ERROR denominator cannot be 0");
            return -404.0;
        }
    }
}

class Example9{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition is " +SimpleMath.arithmeticop(a, b));
        System.out.println("Subtract is " +SimpleMath.arithmrticop(a,b,0));
        System.out.println("Multiply is " +SimpleMath.arithmeticop(a, b, 0, 0));
        System.out.println("Division is " +SimpleMath.arithmeticop((double)a, (double)b));
        sc.close();
    }
}
