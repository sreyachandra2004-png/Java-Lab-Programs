import java.util.Scanner;

class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int num) {
        int temp=num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(reverse);
        if (temp== reverse) {
            return true;
        } else {
            return false;
        }
    }
}