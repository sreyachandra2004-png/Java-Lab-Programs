

abstract class Parent{
    public Parent(){
        System.out.println("I am the constructor of base class");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    public void arya(){
        System.out.println("Arghya...I am inside parent class");
    }
    abstract public void greet1();
    abstract public void greet2();
}
class Child1 extends Parent{
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
        }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
    //Parent p=new Parent(); Parent is abstract class --error
        Child1 c1=new Child1();
        //Child2 c2=new Child2(); --error
        c1.greet1();
        c1.greet2();
        c1.sayhello();
        c1.arya();
    }
}