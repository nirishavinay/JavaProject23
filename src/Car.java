package src;

public class Car {
    String brand;
    String colour;

    Car() // Default Constructor

    {
        brand = "Volksvagan";
        colour = "Black";
    }

    public void method() {
        System.out.println("Brand: " + brand);
        System.out.println("colour: " + colour);
    }

    public static void main(String[] args) {
        Car myCar = new Car();  // Call the default constructor

        myCar.method();
    }
}
