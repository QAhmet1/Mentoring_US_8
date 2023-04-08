package week2._3_wednesday;

public class _01_JavaTypeCasting {
    /*
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
     */

    public static void main(String[] args) {

        // schedule of today : Java Operators and Castings

        // there are 'addition' operators

        int num = 10;
        num+=10;  //    + 10 ---> 20

        System.out.println(num);

        String str = "Hello";
        str += " Java";  // Hello Java

        System.out.println(str);


        // -=, minus equal

        int num2 = 200;
        num2 -=100;   // 100 -- > num2-100 --> 100
        System.out.println(num2);

        // *=; /=

        int num3 = 300;
        num3 /=2;
        System.out.println(num3);   // 150


        // Increments

        // Pre Increment --> increasing the value by one
        int num5 = 10;
        System.out.println(num5++);
        System.out.println("num5 = " + num5);

        System.out.println("------------------------");

        // Pre - Decrement --> decreasing the value by one
        int num6 = 11;
        --num6;
        System.out.println(num6);

        int num10 = 100;
        System.out.println(num10++);  // first passing the value as it is
        System.out.println(num10);   // then prints the new value



   /*
  Warmup tasks:
  Create a class named BirthDay and create the following variable
          name, birthDay(int), birthMonth(String), birthYear(int)

          use concatenation to display the birthday of the person

            if
      name = "John"
               birthDay = 25
                birthMonth = "April"
                birthYear = 1995;

     output:
               John was born on April/25/1995.


     */



        String name = "John";
        int birthDay =  25;     // camel case
        String birthMonth = "April";
        int birthYear = 1995;

        // Some datatypes in java --> byte, short, int, double, long  -- String
        String fullSentence = name + " was born on "  + birthMonth + "/" + birthDay + "/" + birthYear;
        System.out.println(fullSentence);

        // Castings in java
        // casting is a way of converting one datatype to another data type
        // 1) Implicit Casting 2)Explicit Casting

        // Implicit Casting  - casting samller type to larger

        byte number1 = 12;   // byte is smaller than int
        int number2 = number1;

        System.out.println(number2);
        int number3 = 35;
        double number4 = number3;
        System.out.println(number4);


        // Explicit Casting   -- > casting the larger type to smaller

        int number5 = 12;
        byte number6= (byte) number5;
        System.out.println(number6);

        // Example of Implicit Casting
        short number7 = 12;
        long number8=  number7;


        System.out.println(number8);
























    }





}
