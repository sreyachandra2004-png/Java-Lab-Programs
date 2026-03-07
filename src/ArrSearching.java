import java.util.Scanner;

class ArrSearching{
    static void main(String[] args) {
        int[] ar={11,45,67,98,91,82,96,83,48};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key element: ");
        int a=sc.nextInt();
        int index=0;
        int flag=0;
        while(index<ar.length){
            if(a==ar[index]){
                flag=1;
            }
            index++;
        }
        if(flag==1){
            System.out.println("Successful Search");
        }
        else{
            System.out.println("Unsuccessful search");
        }
    }
}