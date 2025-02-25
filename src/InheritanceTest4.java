package src;

class Fruits23{
    void colour(){
        System.out.println("Fruits are in different colours.");
    }
}
class Apple23 extends Fruits23{
    void Red(){
        System.out.println("Apples are in Red colour.");
    }
}
class Mango23 extends Fruits23{
    void yellow(){
        System.out.println("Mangoes are in Yellow colour.");
    }
}
public class InheritanceTest4 {
    public static void main(String[] args) {
Apple23 apple= new Apple23();
apple.Red();
apple.colour();

Mango23 mango =new  Mango23();
mango.yellow();
mango.colour();
    }
}
