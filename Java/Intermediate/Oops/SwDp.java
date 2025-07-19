// Here we are discussing of shallow and deep copy of constructor
public class SwDp {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70};
        Student s1 = new Student("Nikhil",23,marks);

        Student s2= new Student(s1);
        s2.marks[0]=60;

        // Shallow Copy 
        System.out.println("s1 marks[0]: " + s1.marks[0]); // Will print 100 ❌ (unexpected change)
        System.out.println("s2 marks[0]: " + s2.marks[0]); // Will print 100

        // Deep copy
        // System.out.println("s1 marks: " + s1.marks[0]);  Should remain 90 in deep copy
        // System.out.println("s2 marks: " + s2.marks[0]);  Should be 100
        
    }
}

class Student
{
    String name;
    int rollno;
    int marks[];

    Student(String name,int rollno,int marks [])
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }


    // Shallow Copy Constructor 

    Student(Student s1)
    {
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks; // copies reference, not object
    }

    
    // deep Copy constructor


    // Student(Student s1)
    // {
    //     this.name=s1.name;
    //     this.rollno=s1.rollno;
    //     this.marks = new int[s1.marks.length];
    //     for (int i = 0; i < s1.marks.length; i++) {
    //         this.marks[i] = s1.marks[i];
    //     }
        
    // }



}