package src;

public class WrapperUnBoxing
{
    public static void main(String[]areg)
    {
        int number = 111;
        //Boxing Type
        Integer numberWrapper = Integer.valueOf(number);
        System.out.println("The boxing type =  " + numberWrapper);

    //unboxing Type
    int unboxedNumber = numberWrapper.intValue();
    System.out.println("The  Unboxing type =  " + unboxedNumber);
}
}