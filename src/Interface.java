interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee poo pee");
    }
   public void applyBrake(int decrement){
        int b=50;
        b=b-decrement;
       System.out.println("Applying Brake");
       System.out.println("The speed is: "+b+" now");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
}
public class Interface {
    static void main(String[] args) {
AvonCycle av=new AvonCycle();
av.speedUp(7);
av.applyBrake(18);
av.blowHorn();
        System.out.println(av.a);
    }
}