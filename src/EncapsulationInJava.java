package src;

public class EncapsulationInJava
{
    private  String name;
    private String surname ;
    private int age ;

    public static void main(String[] args)
    {
        EncapsulationInJava encapsulation = new EncapsulationInJava();
        encapsulation.setName("Aarush");
        encapsulation.setSurname("Kattu");
        encapsulation.setAge(6);

        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Surname: " +encapsulation.getSurname());
        System.out.println("Age:  "  + encapsulation.getAge());
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
