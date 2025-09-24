
class Student {
    int roll;
    String name;
    int marks;
}

public class ObjectArray {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Ajay";
        s1.marks = 89;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Bijay";
        s2.marks = 85;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Sujay";
        s3.marks = 81;

        // Creating an array of Student objects
        Student[] Std = new Student[3];

        // Storing student objects inside the array
        Std[0] = s1;
        Std[1] = s2;
        Std[2] = s3;

        // Printing student details using object array
        System.out.println("Student details:");
        for (int i = 0; i < Std.length; i++) {
            System.out.println("Roll: " + Std[i].roll +"\nName: " + Std[i].name +"\nMarks: " + Std[i].marks);
            System.out.println();
        }
    }
}
