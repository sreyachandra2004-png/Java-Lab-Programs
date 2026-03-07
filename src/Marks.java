public class Marks{
    public static class StudentData{
        String name="Arghya";
        int rno=249;
        int[] marks;
        StudentData(int s){
            marks=new int[s];
        }
        void display(){
            System.out.println(name+" "+rno+" "+marks);
        }
    }

    public static void main(String[] args) {
     StudentData s1=new StudentData(4);
     //StudentData s2=new StudenData(2);
     s1.marks[0]=95;
     s1.marks[1]=96;
     s1.marks[2]=96;
     s1.marks[3]=96;
     s1.display();
    }
}