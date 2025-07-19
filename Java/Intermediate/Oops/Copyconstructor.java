public class Copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Nikhil";
        s1.rollno=23;
    Student s2 = new Student(s1);
    s2.password="abc";
    System.out.println(s2.name);
    System.out.println(s2.rollno);
    System.out.println(s2.password);
    }
}


class Student
{
    String name;
    int rollno;
    String password;

    Student()
    {
        System.out.println("Constructor is called...");
    }

    Student(Student s1)
    {
        this.name=s1.name;
        this.rollno=s1.rollno;
    }

  
}
