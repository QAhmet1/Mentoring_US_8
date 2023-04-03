package week2._2_tuesday;

public class _02_DataTypes {
    public static void main(String[] args) {

        /*
         TODO Data types are divided into two groups:

         Primitive data types - includes byte, short, int, long, float, double, boolean and char
         Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in later chapter)
         */
        byte byteValue=4;
        short shortValue=3000;
        int intValue=200000;
        long longValue=2222222222222333L;
        // Since it sees numbers as int by default, we added L and said it was long.

        float floatValue=3.14F;
        double doubleValue=3.14;

        char firstLetter='A';

        boolean isYes=true;

        System.out.print("byteValue="); // "" prints byteValue=
        System.out.println(byteValue);  // prints 4

        System.out.println("byteValue=" + byteValue); // prints byteValue=4



        byte byteMin= Byte.MIN_VALUE;
        byte byteMax= Byte.MAX_VALUE;

        short shortMin= Short.MIN_VALUE;
        short shortMax= Short.MAX_VALUE;

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMin = " + shortMin);
        System.out.println("shortMax = " + shortMax);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);



    }
}
