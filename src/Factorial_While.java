import java.util.Scanner;

class Factorial_While{
    void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print factorial of the number: ");
        int n=sc.nextInt();
        operation(n);
    }
    void operation(int f){
        int fact=1;
        int i=1;
       while(i<=f){
           fact=fact*i;
           i++;
       }
        System.out.println("The factorial of the number is: "+fact);
    }
}