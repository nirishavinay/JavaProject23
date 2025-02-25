package src;

class  Animal2{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class  Dog3 extends Animal2{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Horse extends Dog3{
    void Run(){
        System.out.println("Horse is running");
    }
}

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
Horse horse = new Horse();
horse.Run();
horse.bark();
horse.sleep();
    }
}
