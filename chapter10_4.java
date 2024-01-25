// Provide a more compact (but functionally equivalent) version of this code
// fragment:

        // ArrayList<Student> students = new ArrayList<Student>();     
        // Student student1 = new Student("Alex Trotsky, History");
        // students.add(student1);
        // Student student2 = new Student("Megan Cooper, Computer Science");
        // students.add(student2);

import java.util.ArrayList;

public class chapter10_4 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        // more compact code segment, these students are available to be accessed via the arrayList they have been added to 

        students.add(new Student("Alex Trotsky", "History"));
        students.add(new Student("Megan Cooper", "Computer Science"));

        // creates a new student object, and occupies it with the student in the arrayList
        Student student1 = students.get(0);
        Student student2 = students.get(1);


    // student1 and student2 are instances or objects of the Student class, and have been constructed with a name and a subject


        System.out.println(student1.name + " studies " + student1.subject);
        System.out.println(student2.name + " studies " + student2.subject);

        // or you can use .get() on the students ArrayList

        System.out.println(students.get(0).name + " studies " + students.get(0).subject);
        System.out.println(students.get(1).name + " studies " + students.get(1).subject);
    }
}
 
class Student {
    public String name;
    public String subject;

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

}