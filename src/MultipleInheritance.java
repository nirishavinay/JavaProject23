package src;

class Grandfather
{
    void Soldier()
    {
       System.out.println("My Grandfather is a Soldier.");
    }
}
class Father extends Grandfather {
    void BankEmploye()
    {
        System.out.println("My father is a BankEmploye.");
    }
}
public class MultipleInheritance
{
    public static void main(String[] args)
    {
        Father f = new Father();
        f.BankEmploye();
        f.Soldier();
    }
}
