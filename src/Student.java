package src;

public class Student {
    String name;
    int id;

    Student(String n, int i)  // Parameterized Constructor

    {
        name = n;
        id = i;
    }

    public void method()
    {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public static void main(String[] args)
    {
        Student std = new Student("Akshara", 2378);   // Call the parameterized constructor

        std.method();
    }
}
