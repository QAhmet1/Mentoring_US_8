package week2._4_thursday;

public class _01_JavaOperators {
    /*
    Java Operators
   Operators are used to perform operations on variables and values.

Arithmetic Operators:
+: Addition
-: Subtract
*: Multiplication
/: Division

Relational Operators
>, >=, < , <=, ==, !=

Short Hand Operators
=, +=, -=, *=, /=

Unary Operators
Pre Increment ++a, Pre Decrement --a
Post Increment a++, Post Decrement a--
     */
    public static void main(String[] args) {


        // + (Plus Operator)
        int a = 100;
        int b = 200;

        System.out.println(a+b);

        // - (Minus Operator)

        System.out.println(b-a);

        //  / ( Division Operator)

        System.out.println(b/a);

        // *  (multiplication)

        System.out.println(a*b);


        double c = 10.0;
        int d = 4;

        System.out.println(c/d);


        // Remainder %
        // With remainder : We want to find the remainder of a division operation

        // 8 % 3---> 8/3= 2-->  2*3= 6  ---> 8 - 6 --> 2

        int e;  // Here is declaration
        e = 23;  // Here is assignment

        int f = 3;
        System.out.println(e%f);

        System.out.println("--------------------------------------");
        // Relational Operators
        // >, >=, <, <=, ==, !=

        int r = 300;
        int s = 400;       // boolean -- > is used for comparison

        if ( r != s ) {   // 400 > 300 --> Yes, True
            System.out.println("Hello Java");
        }

        System.out.println("--------------------------------------");

        int creditScore = 751;
        if (creditScore>=750) {
            System.out.println("You are eligible to buy");
        }

        char x = 'A';
        char y = 'A';

        // Java is a case-sensitive language

        if (x==y) {
            System.out.println("They are equal");
        }


        // ShorHand Operators

        String str = "Java Programming";   str = "C Sharp";
        str = "Pythoon Programming";
        str = "Hello";


        System.out.println("str = " + str);

        System.out.println("--------------------------------------");

        // concatenation in java

        String firstName = "John";
        String lastName = "Lennon";

        // fullName = John Lennon

        String fullName = firstName+  " " +  lastName;
        System.out.println(fullName);

        System.out.println("--------------------------------------");

        String number = "1";  // If even seems as number actualy This is string
        String number2 = "4";
        System.out.println(number + number2); // output = 14 (not an arithmetic operation)


        System.out.println("--------------------------------------");

        int number3 = 12;
        int number4 = 10;
        System.out.println(number3     +       number4);
























    }








}
