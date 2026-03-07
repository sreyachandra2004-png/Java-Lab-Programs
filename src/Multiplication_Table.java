import java.util.Scanner;
class Multiplication_Table{
     void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table of it: ");
        int a= sc.nextInt();
        table(a);
    }
    void table(int n){
        System.out.println(("This is the multiplication table for the number "+n));
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}