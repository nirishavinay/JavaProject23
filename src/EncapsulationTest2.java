package src;

public class EncapsulationTest2
{
    private int rectangle_length;
    private int rectangle_width;

    public double get_Area()
    {
        return rectangle_length*rectangle_width;
    }
    public static void main(String[] args) {

        EncapsulationTest2 encapsulationTest2 = new EncapsulationTest2();
        encapsulationTest2.setRectangle_length(20200);
        encapsulationTest2.setRectangle_width(50500);
        System.out.println("Rectangle_Length: " +encapsulationTest2.getRectangle_length());
        System.out.println("Rectangle_Width: "+encapsulationTest2.getRectangle_width());
        System.out.println("Area of Rectangle: " +encapsulationTest2.get_Area());
    }

    public int getRectangle_length() {
        return rectangle_length;
    }

    public void setRectangle_length(int rectangle_length) {
        this.rectangle_length = rectangle_length;
    }

    public int getRectangle_width() {
        return rectangle_width;
    }

    public void setRectangle_width(int rectangle_width) {
        this.rectangle_width = rectangle_width;
    }


}
