package src;

public class StringBuffer1
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Neerisha");

        sb.append(" Gopai");
        System.out.println("Appended String is: " + sb);

        sb.reverse();
        System.out.println("Reverse String is: " + sb);

        sb.delete(2, 4);
        System.out.println("Deleted string  is: " + sb);

        sb.insert(5, " Kattu");
        System.out.println("inserted String is: " + sb);

    }
}