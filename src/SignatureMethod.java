package src;

public class SignatureMethod
{

    public static void main(String[] args)
    {
        System.out.println("Hello SignatureMethod ");//1

        SignatureMethod sig = new SignatureMethod();
        sig.method("Aarush",9,22);

        String str = "Aarush";
        byte b = 9;
        int j = 22;
    }
    public void method(String str,int i,int j)
    {
        System.out.println("hello signature method");//3
    }

    public void method(String str,int i,byte b)
    {
        System.out.println("Hello java signature method");//2
    }
}
