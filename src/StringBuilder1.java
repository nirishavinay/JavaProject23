package src;

public class StringBuilder1
{
        public static void main(String[] args)

        {
            StringBuilder sb = new StringBuilder("Welcome");


            sb.append("Java Program!");
            System.out.println("Appended: " + sb);

            sb.insert(8, "StringBuilder");
            System.out.println("Inserted: " + sb);


            sb.reverse();
            System.out.println("Reversed: " + sb);

            sb.delete(5, 10);
            System.out.println("Deleted: " + sb);
        }
    }



