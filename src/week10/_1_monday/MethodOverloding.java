package week10._1_monday;
/*
Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */
public class MethodOverloding {

    // Why are we using method over loading?
    // Must: using same method name + different parameters




    public static void sumOfTwoNumbers(int a, int b ) {
        System.out.println( a + b);
    }


    public static void sumOfThreeNumbers(int a, int b, int c) {
        System.out.println(a+b+c);
    }


    public static void sumOfFourNumbers (int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }


    public static void main(String[] args) {

        sumOfTwoNumbers(12,23);
        sumOfThreeNumbers(23,34,56);
        sumOfFourNumbers(1,2,3,4);







    }











}
