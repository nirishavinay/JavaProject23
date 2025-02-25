package src;

public class StaticVarInNonStatic
{
    static int i = 230;

    public void Nonstaticmethod()
    {

            System.out.println("static variable: " + i);
}
        public static void main(String[] args)
        {
            StaticVarInNonStatic obj = new StaticVarInNonStatic();
            obj.Nonstaticmethod();
    }


}
