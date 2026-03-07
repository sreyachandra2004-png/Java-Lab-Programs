public class PolyMorphism{
    public static class Dog{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    public static class Cat{
        void sound(){
            System.out.println("Meow Meow");
        }
    }
    public static class Human{
        void sound(){
            System.out.println("Human Speaks");
        }
    }

   public static void main(String[] args) {
        Dog tommy=new Dog();
        Cat c=new Cat();
        Human Arghya=new Human();
        tommy.sound();
        c.sound();
        Arghya.sound();

    }
}