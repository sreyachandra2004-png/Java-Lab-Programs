import java.util.Scanner;
import java.util.Date;
class Method {
    void greet() {
        Date d = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning, " + name + "!");
        System.out.println(("" + name + ",It is " + d));
    }

    public  void main() {
        greet();

    }
}