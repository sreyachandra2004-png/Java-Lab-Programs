class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class Getter_Setter{
    public static void main(String[] args) {
        MyEmployee harry=new MyEmployee();
        // harry.id=45;
        //harry.name="Codewithharry";--> Throws an error due to private access modifier
        harry.setName("Code With Harry");
        harry.setId(249);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}