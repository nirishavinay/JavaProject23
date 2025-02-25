package src;

public class NonStaticBlock{


    NonStaticBlock(){

        System.out.println("from   NonStaticBlock Constructor");

    }

    public static void main(String[] args){

        NonStaticBlock nonBlock = new NonStaticBlock();

        System.out.println("from NonStaticBlock main");


    }

    static{

        System.out.println("from static  block 1");

        NonStaticBlock nonBlock = new NonStaticBlock();
    }
    static
    {
        System.out.println("from NonStaticBlock main");

        NonStaticBlock nonBlock = new NonStaticBlock();

    }

    {

        System.out.println("from non static block 1");

    }

    static{

        NonStaticBlock nonBlock = new NonStaticBlock();

        System.out.println("from NonStaticBlock main");
    }

    {
        System.out.println("from static block 2");

    }

}
