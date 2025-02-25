package src;

class PetAnimal
{
PetAnimal()
{
	System.out.println(" It is a pet Animal.");
}

String breed = "German shepherd";

}
class Dog1 extends PetAnimal
{
	Dog1()
	{
	System.out.println("Dog is barking.");
	}

int age = 3;
}
class Puppy extends Dog1
{
Puppy()
{
System.out.println("Puppy is sleeping."); 
}


String name=" Robo ";
}

public class Inheritence
{
public static void main(String args[])

{
Puppy pup = new Puppy();
System.out.println(pup.age);
    System.out.println(pup.name);
    System.out.println(pup.breed);
}
}