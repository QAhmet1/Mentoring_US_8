package week12._3_wednesday;

public class Task3 {
    public static void main(String[] args) {


        System.out.println("Hello World");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello World2");




    }
}
