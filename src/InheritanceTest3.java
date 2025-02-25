package src;

interface Animal23{
void run();
}
interface DomesticAnimal{
    void sound();
}
class Horse1 implements Animal23,DomesticAnimal{
    public void run(){
        System.out.println("Horse run fastly.");
    }
    public void sound(){
        System.out.println("Horse sounds Neigh..Neigh..");
    }
}
public class InheritanceTest3 {
    public static void main(String[] args) {
        Horse1 h1= new Horse1();
        h1.run();
        h1.sound();
    }
}
