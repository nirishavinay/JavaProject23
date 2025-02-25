package src;

interface Greetings{
    String operate(String a,String b);
}
public class LambdaTest2 {
    public static void main(String[] args) {
        Greetings HelloWorld=(a,b)->a+b;
        System.out.println(HelloWorld.operate("Hello","World"));
    }
}
