package src;

public class GlobalToLocalInJava {
    static String str = "Welcome";

    public static void main(String[] args) {
        String str1 = "Java";
        System.out.println(str + " to " + str + " program. ");
        changestr();
    }

    private static void changestr()
    {
        str = "Hello";
        System.out.println("After calling method str: " + str);

    }
}
