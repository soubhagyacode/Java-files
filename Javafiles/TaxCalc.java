import java.util.Scanner;
class Tax{
    int s;
    int choice;
    Tax(int salary)
    {
        s=salary;
    }
    int Taxreturn()
    {
        if(s<=10000)
        {
            choice=0;
        }
        else if(s<=25000)
        {
            choice=1;
        }
        else if(s<=50000)
        {
            choice=2;
        }
        else if(s<=75000)
        {
            choice=3;
        }
        else if(s<=100000)
        {
            choice=4;
        }
        else{
            choice=5;
        }

        switch(choice)
        {
            case 0:
            return 0;
            case 1:
            return 100;
            case 2:
            return 200;
            case 3:
            return 300;
            case 4:
            return 450;
            case 5:
            return 650;
            default:
            return -1;
        }
    }
}
class TaxCalc {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER YOUR SALARY- ");
        int salary= sc.nextInt();
        Tax t= new Tax(salary);
        System.out.println("Tax for respective salary is- " + t.Taxreturn());
    }
}
