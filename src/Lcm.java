import java.util.Scanner;

public class Lcm {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to calculate LCM: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int i=1;
        int LCM;
        while(true){
            int factor=a*i;
            if(factor%b==0){
                LCM=factor;
                break;
            }
            i++;
        }
        System.out.println(LCM);
    }
}