import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

// Sorting uisng Comparator
public class StudentComparator {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(21, "Harsh"));
        stud.add(new Student(20, "David"));
        stud.add(new Student(19, "Priya"));
        stud.add(new Student(24, "Ajay"));
        stud.add(new Student(22, "Danial"));

        for (Student s : stud){
            System.out.println(s);
        }

        Collections.sort(stud, com);

        System.out.println("\nAfter Sorting by Age: ");
        for (Student s : stud){
            System.out.println(s);
        }

    }
}
