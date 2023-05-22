package week10._1_monday;

public class MethodTask {

// for method overloading 1) method name has to be same 2) parameters have to be different

    public static void sumOfNumbers (int num1, int num2) {
        System.out.println(num1+num2);
    }

    protected static  void sumOfNumbers (int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }


    public static void main(String[] args) {

        // method calling area
        // method overloading is different from method overriding


    sumOfNumbers(12,34,56);
    sumOfNumbers(1,2);





    }





}
