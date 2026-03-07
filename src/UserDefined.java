import java.util.Scanner;

public  class UserDefined {
    public static class Student{ //Userdefined Data type
        String name;
        int roll_no;
        double cgpa;
        void print(){
            System.out.println(name+" "+roll_no+" "+cgpa+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();// Object Creation
        s1.name="Arghya";//declaration
        s1.roll_no=249;
        s1.cgpa=9.51;
        Student s2=new Student();
        s2.name="Sreya";
        s2.roll_no=55;
        s2.cgpa=9.4;
        Student s3=new Student();
        System.out.println("Enter the student name:");
        s3.name=sc.nextLine();
        System.out.println("Enter the roll no:");
        s3.roll_no=sc.nextInt();
        System.out.println("Enter the CGPA:");
        s3.cgpa=sc.nextDouble();
        System.out.println(s1.name+" "+s1.roll_no+" "+s1.cgpa+" ");
        System.out.println(s2.name+" "+s2.roll_no+" "+s2.cgpa+" ");
        System.out.println(s3.name+" "+s3.roll_no+" "+s3.cgpa+" ");
        s1.print();
        s2.print();
        s3.print();
    }

}