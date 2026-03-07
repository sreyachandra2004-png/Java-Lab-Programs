import java.util.Scanner;

class Armstrong_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int count=0;
        int sum=0;
        int original=num;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
         temp=num;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;
        }
        if(original==sum){
            System.out.println("Armstrong number ");
        }
        else{
            System.out.println("It is not an Armstrong number ");
        }
    }
}