import java.util.Scanner;

class Sum_Avg_Array{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the array elemnets no "+(i+1));
            ar[i]=sc.nextInt();
        }
        double sum=0.0;
        double avg=0.0;
        for(int i=0;i<n;i++){
           sum=sum+ar[i];
        }
        avg=(double)sum/n;
        System.out.println("Sum of the array is = "+sum);
        System.out.println("Avg of the array is = "+avg);
    }
}