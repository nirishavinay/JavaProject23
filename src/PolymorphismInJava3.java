package src;

class Employee1
{
    String firstname(String str1)
    {
        return str1;
    }
    String lastname(String str2)
    {
        return str2;
    }
    int age ( int i)
    {
        return i;
    }
}

public class PolymorphismInJava3
{
    public static void main(String[] args) {
       Employee1 e = new Employee1();
        System.out.println("Employee Firstname: " + e.firstname("Aarush"));
        System.out.println("Employee lastname: " + e.lastname("Kattu"));
        System.out.println("Employee age: " + e.age(6));
    }
}




