public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        //Don't need call constructor at the time of object creation constructor is called.
        Student s2 = new Student("Nikhil");
        System.out.println(s2.name);
        Student s3 =new Student(123);
        System.out.println(s3.rollno);
    }
}

class Student
{
    String name;
    int rollno;

    Student()
    {
        System.out.println("Constructor is called...");
    }

    Student(String name) // Parametrized as well as Constructor overloading.
    {
        this.name=name;
    }

    Student(int rollno)
    {
        this.rollno=rollno;
    }

}
