import java.util.Scanner;

class Count_Array{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the array elemnets no "+(i+1));
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the key elemnt to search the occurence of any element in the array: ");
        int key=sc.nextInt();
        int count=0;
        for (int i=0;i<n;i++){
            if(ar[i]==key){
                count++;
            }
        }
        System.out.println("The element is "+count+" times in the array");
    }
}