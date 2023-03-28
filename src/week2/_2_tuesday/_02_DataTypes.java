package week2._2_tuesday;

public class _02_DataTypes {
    public static void main(String[] args) {

        /*
         TODO Data types are divided into two groups:

         Primitive data types - includes byte, short, int, long, float, double, boolean and char
         Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
         */
        byte byteValue=4;
        short shortValue=3000;
        int intValue=200000;
        long longValue=2222222222222333L;
        // Default olarak rakamları int gördüğünden L ekleyerek long olduğunu söyledik.

        float floatValue=3.14F;
        double doubleValue=3.14;

        char firstLetter='A';

        boolean isYes=true;

        System.out.print("byteValue="); // "" prints byteValue=
        System.out.println(byteValue);  // prints 4

        System.out.println("byteValue=" + byteValue); // prints byteValue=4

    }
}
