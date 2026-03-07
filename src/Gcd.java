import java.util.Scanner;

public class Gcd {
    static int operation(int a,int b) {
        int GCD = 1;
        int i = 2;
        int least = Math.min(a, b);
//        System.out.println(least);
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
            i++;
        }
        return GCD;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to calculate GCD: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
       int result=operation(a,b);
        System.out.println("The GCD of the two numbers is: "+result);
    }
}