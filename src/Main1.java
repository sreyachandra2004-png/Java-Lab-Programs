class Student {
    String name;
    int roll;
    int age;

    // Constructor 1: No parameters
    Student() {
        name = "Unknown";
        roll = 0;
        age = 0;
    }

    // Constructor 2: Two parameters
    Student(String n, int r) {
        name = n;
        roll = r;
        age = 18;
    }

    // Constructor 3: Three parameters
    Student(String n, int r, int a) {
        name = n;
        roll = r;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + roll + " - " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student();                    // calls constructor 1
        Student s2 = new Student("Arghya", 10);        // calls constructor 2
        Student s3 = new Student("Rahul", 15, 20);     // calls constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
