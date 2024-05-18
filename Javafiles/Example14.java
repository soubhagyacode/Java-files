abstract class Shapes {
    double cost = 500;
    double area;
    boolean topaint;
    String color;
    String Shapename;

    double getCost() {
        return cost*area;
    }

    void show(){
        if (topaint == true)
        {
            String ans=Shapename+"\nCost for painting is: "+getCost()+"\nColor: "+color+"\nArea: "+area;
            System.out.println(ans);
        } else
        {
            System.out.println(Shapename+" "+"is not painted");
        }
    }
}

class Circles extends Shapes {
    double r;
    static int count=0;
    Circles(double radius,boolean topaint, String color) {
        r = radius;
        this.color = color;
        this.topaint=topaint;
        count++;
        Shapename="Circle"+count;
        area=3.14 * r * r;
    }
}

class Rectangles extends Shapes {
    double l;
    double b;
    static int count=0;
    Rectangles(double length, double breadth,boolean topaint, String color) {
        l = length;
        b = breadth;
        this.color = color;
        this.topaint=topaint;
        count++;
        Shapename="Rectangle"+count;
        area=l*b;
    }
}

class Squares extends Shapes {
    double s;
    static int count=0;
    Squares(double side,boolean topaint, String color) {
        s = side;
        this.color = color;
        this.topaint=topaint;
        count++;
        Shapename="Square"+count;
        area=s*s;
    }
}

public class Example14 {
    public static void main(String args[]) {
        Shapes[] sh = new Shapes[5];
        sh[0] = new Circles(5, true, "red");
        sh[1] = new Circles(7, false, "green");
        sh[2] = new Rectangles(5,4,true, "Red");
        sh[3] = new Rectangles(5,4,false,"Green");
        sh[4] = new Squares(5,true, "Grey");

        for (Shapes shape : sh) {
            shape.show();
            System.out.println();
        }
    }
}
