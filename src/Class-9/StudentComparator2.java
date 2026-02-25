import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


// Sorting using implementing Comparable interface
class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // 'CompareTo' is the method of 'Comparable' interface
    public int compareTo(Student that) {

        if (this.age > that.age)
            return 1;
        else
            return -1;
    }

}

public class StudentComparator2 {
    public static void main(String[] args) {

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(21, "Harsh"));
        stud.add(new Student(20, "David"));
        stud.add(new Student(19, "Priya"));
        stud.add(new Student(24, "Ajay"));
        stud.add(new Student(22, "Danial"));

        for (Student s : stud){
            System.out.println(s);
        }

        Collections.sort(stud);

        System.out.println("\nAfter Sorting by Age: ");
        for (Student s : stud){
            System.out.println(s);
        }

    }
}
