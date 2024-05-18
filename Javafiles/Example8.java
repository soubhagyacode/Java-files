import java.util.Scanner;

class Score{
    String subjectCode;
    String subjectName;
    int marksInthatSubject;
    Score(String sc,String sn,int m)
    {
        subjectCode=sc;
        subjectName=sn;
        marksInthatSubject=m;
    }
    String getSC()
    {
        return subjectCode;
    }
    String getSN()
    {
        return subjectName;
    }
    int getMarks()
    {
        return marksInthatSubject;
    }
}

class Student {
    String studentname;
    int semester;
    Score[] subjectdetails;
    Student(String name, int sem, Score[] subjectdetails)
    {
        studentname=name;
        semester=sem;
        this.subjectdetails=subjectdetails;
    }
    void Display(){
        System.out.println("Student name: "+ studentname);
        System.out.println("Semester: "+ semester);
        for(int i=0;i<5;i++)
        {
            System.out.println("Subject Code: " +subjectdetails[i].getSC()+" Subject Name: " +subjectdetails[i].getSN()+
            " Marks in that Subject: "+subjectdetails[i].getMarks());
        }
    }
}

class Example8{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input of 5 subjects");
        Score[] subjectdetails= new Score[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter code ");
            String subjectCode= sc.next();
            System.out.print("Enter name ");
            String subjectName=sc.next();
            System.out.print("Enter marks ");
            int marks=sc.nextInt();
            subjectdetails[i]=new Score(subjectCode,subjectName,marks);
        }
        Student s1=new Student("Ali",1,subjectdetails);
        s1.Display();
        sc.close();
    }
}