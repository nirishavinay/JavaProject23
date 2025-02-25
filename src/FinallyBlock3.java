package src;

public class FinallyBlock3
{
    public static void main(String[] args) {


try {
    int [] numbers = {10,20,30,40,50};
    System.out.println(numbers[8]);
}
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutBoundsException  " +e.getMessage());
}
finally {
    System.out.println("In finally block");
}
    }
}