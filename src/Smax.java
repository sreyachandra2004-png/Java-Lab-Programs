public class Smax{
    void max(int ar[]){
        int max1;
        int max2;
       if(ar[0]>ar[1]) {
           max1 = ar[0];
           max2 = ar[1];
       }
       else{
           max2=ar[0];
           max1=ar[1];
       }
       for(int i=2;i<ar.length;i++){
           if(ar[i]>max1){
               max2=max1;
               max1=ar[i];
           }
           else if (ar[i]>max2) {
               max2=ar[i];
           }
       }
        System.out.println("Maximum element is: "+max1);
        System.out.println("Second maximum element is: "+max2);
    }
    void min(int ar[]){
        int min1;
        int min2;
        if(ar[0]<ar[1]){
            min1=ar[0];
            min2=ar[1];
        }
        else{
            min2=ar[0];
            min1=ar[1];
        }
        for(int i=2;i<ar.length;i++){
            if(ar[i]<min1){
                min2=min1;
                min1=ar[i];
            }
            else if (ar[i]<min2) {
                min2=ar[i];

            }
        }
        System.out.println("Minimum element is: "+min1);
        System.out.println("Second minimum elemnt is:"+min2);
    }
    void main(String[] args) {
        int[] ar={59,14,8,6,11,57,44,99,120,87};
        min(ar);
        max(ar);
    }
}