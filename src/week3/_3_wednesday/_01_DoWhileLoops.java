package week3._3_wednesday;

public class _01_DoWhileLoops {
    public static void main(String[] args) {


        // This is the algorithm of finding the sum with while loop from 1 to 50
        int sum =0;
        int i=0;

        while (i<=50) {
            sum+= i;
            i++;
        }

        System.out.println(sum);


        // Difference between While Looop and Do While Loop
        // In Do While Loop if even the condition is false it is executed once.

        int m =12;
        while (m>13) {  // This is a false condition
            System.out.println("While Loop");
        }

        System.out.println("--------------------------");
        do {
            System.out.println("Hello Java");   // In Do While evertime There is one execution
        } while (m>13);

        // We can use do while loop like while loop
        // Print Hello World  Five Times
        int j=0;

        do {
            System.out.println("Hello World");
            j++;
        } while (j<5);



        // Comparison with String

        String str = "John";
        System.out.println("----------------");

        do {
            // implementation body
            System.out.println("Hello John");

        } while ( str.equals("John") );          //  equals is used to compare strings only



        // EXAMPLE 2
        int s =12;
        do {
            System.out.println("Hello World");

        } while (s<5);  // Normally The condition here is false


        // print "hello techno study" five times wiht do  while loop
        // YOU CAN USE DO WHILE LOOP LIKE WHILE LOOP THIS WAY

        int n =0;

        do {
            System.out.println("hello techno Study");
            n++;
        } while (n<5);




















    }




}
