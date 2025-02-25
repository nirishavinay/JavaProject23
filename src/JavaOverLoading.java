package src;

public class JavaOverLoading{
    public static void main(String[] args){
        System.out.println("Hello from JavaOverLoading");
        JavaOverLoading jol = new JavaOverLoading();
        byte b =5;
        jol.display(10,"Hello",b);
    }
    private void display(int i,String s,byte j){
        System.out.println("Hello from display 3 param ");
    }
    private void display(String name,int i){
        System.out.println("Hello from display 2 param");
    }

}