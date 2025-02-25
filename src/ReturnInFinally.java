package src;

public class ReturnInFinally {
    public static void main(String[] args) {
        System.out.println(Method());
    }

    public static int Method() {
        try {
            System.out.println("In try block");
            return 1;
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2;
        } finally {
            System.out.println("In finally block");
            return 3;
        }
    }
}
