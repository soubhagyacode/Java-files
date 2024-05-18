import java.util.Scanner;

interface people{
   int getan();
   void show();
}

class Student implements people{
    public
        int aadhar_no;
        int regn_no;
        String std_name;
        String branch;
        int year;

        Student (int an,int rn,String name,String branch,int year)
        {
            aadhar_no=an;
            regn_no=rn;
            std_name=name;
            this.branch=branch;
            this.year=year;
        }

        public int getan()
        {
            return aadhar_no;
        }

        public void show()
        {
            String ans=aadhar_no+" "+regn_no+" "+std_name+" "+branch+" "+year;
            System.out.println(ans);
        }
}

class Employee implements people{
    public
        int aadhar_no;
        int emp_id;
        String emp_name;
        String date_of_joining;

        Employee (int an,int emp_id,String name,String doj)
        {
            aadhar_no=an;
            this.emp_id=emp_id;
            this.emp_name=name;
            date_of_joining=doj;
        }

        public int getan()
        {
            return aadhar_no;
        }

        public void show()
        {
            String ans=aadhar_no+" "+emp_id+" "+emp_name+" "+date_of_joining;
            System.out.println(ans);
        }
}


public class databaseOUTR {
    public static void main(String args[])
    {
        people[] arr=new people[6];
        arr[0]=new Student(123,01, "Soubhagya", "Mathematics", 3);
        arr[1]=new Student(345,02, "Soubhagy", "Mathematic", 3);
        arr[2]=new Student(567,03, "Soubhag", "Mathemati", 3);
        arr[3]=new Employee(789,01, "Soubha", "08-10-2002");
        arr[4]=new Employee(912,02, "Soubh", "19-08-1998");
        arr[5]=new Employee(234,03, "Soub", "17-12-1995");

        System.out.println("Enter the aadhar number you want to search for:");
        Scanner sc=new Scanner(System.in);
        int aadhar=sc.nextInt();
        for(people p: arr)
        {
            if(p.getan()==aadhar)
            {
                p.show();
            }
        }
        sc.close();
    }
}
