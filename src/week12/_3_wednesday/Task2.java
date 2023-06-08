package week12._3_wednesday;

public class Task2 {


    public static void main(String[] args) {

        int a=12;
        int b=0;

try {
    System.out.println(a/b);    // This is the code that causes exception
} catch (ArithmeticException e) {
e.printStackTrace();
    System.out.println(e.getMessage());

}




        System.out.println("Hello World");






    }
}
