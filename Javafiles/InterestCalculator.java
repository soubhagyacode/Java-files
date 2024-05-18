import java.util.Scanner;

class InterestCalculator{
    private double p,i;
    public InterestCalculator(double interest, double principal){
        this.p = principal;
        this.i = interest;
    }
    public double QC(){
        double temp=1+i/400;
        return p*Math.pow(temp,4)-p;
    }
    public double MS(){
        return p*i/100;
    }
}
class InterestCalculatorMain {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount- ");
        double p = sc.nextDouble();
        System.out.print("Enter interest- ");
        double i = sc.nextDouble();

        InterestCalculator ic = new InterestCalculator(i,p);
        System.out.println("Monthly Simple Interest: "+ic.MS());
        System.out.println("Quarterly Compound Interest: "+(ic.QC()));
    }
}
