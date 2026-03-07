public class Smax_B{
   /* void min(int ar[]){
        int minimum=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<minimum){
                minimum=ar[i];
            }
        }
        System.out.println("The minimum element of the array is "+minimum);
    }*/
    void max(int ar[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max1){
                max1=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max2 && ar[i]!=max1){
                max2=ar[i];
            }
        }
        System.out.println("The maximum element in the array is: "+max1);
        System.out.println("The second maximum element of the array is: "+max2);
    }
    void main(String[] args) {
        int[] ar={59,14,8,6,11,2,57,44,120,120,87};
        //min(ar);
        max(ar);
    }
}