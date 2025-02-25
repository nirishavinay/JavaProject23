package src;

public class WrapperClassExample
{
    public static void main(String[] args)
    {
        byte b = 5;
        Byte bWrapper = Byte.valueOf(b); //Boxing type
        System.out.println("Boxing Byte: " + bWrapper);
        byte unboxedb = bWrapper.byteValue(); //Unboxing type
        System.out.println("Unboxing Byte: " + unboxedb);

        short s = 50;
        Short sWrapper = Short.valueOf(s); //Boxing type
        System.out.println("Boxing Short: " + sWrapper);
        short unboxeds = sWrapper.shortValue(); //Unboxing type
        System.out.println("Unboxing short: " + unboxeds);


        int num = 100;
        Integer numWrapper = Integer.valueOf(num); // Boxing type

        System.out.println("Boxing Integer: " + numWrapper);

        int unboxedNum = numWrapper.intValue(); // Unboxing type
        System.out.println("Unboxing int: " + unboxedNum);

        float f = 1.223f;
        Float fWrapper = Float.valueOf(f); //Boxing type
        System.out.println("Boxing Float: " + fWrapper);
        float unboxedf = fWrapper.floatValue(); //Unboxing type
        System.out.println("Unboxing float: " + unboxedf);

        double dValue = 3.14;
        Double dWrapper = Double.valueOf(dValue); // Boxing
        System.out.println("Boxing Double: " + dWrapper);
        double unboxedDValue = dWrapper.doubleValue(); // Unboxing
        System.out.println("Unboxing double: " + unboxedDValue);

        char ch = 'A';
        Character chWrapper = Character.valueOf(ch); //Boxing type
        System.out.println("Boxing Character: " + chWrapper);
        char unboxedCH = chWrapper.charValue(); //Unboxed type
        System.out.println("Unboxing Character: " +  unboxedCH);

        boolean b1 = true;
       Boolean b1Wrapper = Boolean.valueOf(b1); //Boxing type
        System.out.println("Boxing Boolean: " + b1Wrapper);
        boolean  unboxedb1 = b1Wrapper.booleanValue(); //UnBoxing type
        System.out.println("Unboxing boolean: " +  unboxedb1);

        long lValue = 123456789L;
        Long lWrapper = Long.valueOf(lValue); // Boxing type
        System.out.println("Boxed Long: " + lWrapper);
        long unboxedLValue = lWrapper.longValue(); // Unboxing type
        System.out.println("Unboxed long: " + unboxedLValue);


    }
}
