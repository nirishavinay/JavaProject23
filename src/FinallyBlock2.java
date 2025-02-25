package src;

public class FinallyBlock2
{
    public static void main(String[] args) {
        System.out.println(testMethod());
    }
    public static int testMethod(){
        try{
            System.out.println("In try block");
            return 100;
        }
        catch (Exception e){
            System.out.println("In catck block "  +e.getMessage());
            return 200;
        }
        finally {
            System.out.println("In finally block");
            return 300;
        }
    }
}