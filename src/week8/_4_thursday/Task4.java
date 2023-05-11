package week8._4_thursday;
/*
 2. Write a method which prints out the numbers from 1 to 100 but for numbers
 which are a multiple of both 3 and 5, print "FINRA" instead of the number,
 for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers
 which are a multiple of 5, print "RA" instead of the number.     must be instance, void method

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */

public class Task4 {

    public static void main(String[] args) {
        // This is not the area that I am gonna work, methods should be created outside main method inside class.

        Task4 task4 = new Task4();  // This is object that belongs to Task4 class
        task4.finra();


    }




    public void finra () {


        // If a number is divisible both by 3 and 5 ? That means it is divisible 15-- 15,30,45,60....
        // If a number is divisible by three  3,6,9,12, 15....
        // If a number is divisible by five  5,10,15.....

        for (int i = 1; i <= 100; i++) {

            if (i  %  15==0) {
                System.out.print(" FINRA ");
            } else if (i%3==0 ) {
                System.out.print(" FIN ");
            } else if (i%5==0) {
                System.out.print(" RA ");
            } else {
                System.out.print(" " + i + " ");
            }

        }

    }

}
