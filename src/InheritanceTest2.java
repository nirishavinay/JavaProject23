package src;

class Grandpaa{
    void work(){
        System.out.println("Grandpaa worked as an army officer.");
    }
}
class Father1 extends Grandpaa{
    void employee(){
        System.out.println("My Father is a bank employee.");
    }
}
class Child extends Father1{
    void study(){
        System.out.println("Child is studying in school.");
    }
        }
public class InheritanceTest2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.work();
        c.employee();
        c.study();
    }
}
