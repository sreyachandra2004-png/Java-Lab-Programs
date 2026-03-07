public class Max_Min {
    void min(int ar[]){
        int minimum=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<minimum){
                minimum=ar[i];
            }
        }
        System.out.println("The minimum element of the array is "+minimum);
    }
    void max(int ar[]){
        int maximum=ar[0];
        for(int i=0;i<ar.length;i++){
           if(ar[i]>maximum){
               maximum=ar[i];
           }
        }
        System.out.println("The maximum element in the array is: "+maximum);
    }
    void main(String[] args) {
        int[] ar={59,14,8,6,11,2,57,44,99,120,87};
        min(ar);
        max(ar);
    }
}