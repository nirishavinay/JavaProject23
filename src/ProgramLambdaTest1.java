package src;

interface MathOperation{
    int Operate(int a,int b);
}
public class ProgramLambdaTest1 {
    public static void main(String[] args) {
        MathOperation addition=(a,b)->a+b;
        System.out.println(addition.Operate(3,7));
    }
}
