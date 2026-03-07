import java.util.Scanner;

class Odd_sum{
    void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last limit from 1: ");
        int n = sc.nextInt();
        sum(n);
    }
        void sum(int n){
        int add=0;
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    add=add+i;
                }
            }
            System.out.println("The odd sum of the addition from 1 to "+n+" = "+add);
        }
}