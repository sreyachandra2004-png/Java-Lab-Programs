import java.util.Scanner;

class Sumof_Digits{
    static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int digit;
        while(n!=0){
          digit=n%10;
          sum=sum+digit;
          n=n/10;
        }
        System.out.println("The sum of the digits of the number is: "+sum);
    }
}