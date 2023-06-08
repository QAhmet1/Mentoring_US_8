package week12._4_thursday;

public class Task7 {

    // finally block


    public static void main(String[] args) {

        // Finally block always gets executed It does not matter whether we have exception or not. but as you know catch block only
        // gets executed when we have exception

        try {
            System.out.println(2/2);
        } catch (Exception e) {
            System.out.println("Hello Catch");
        } finally {
            System.out.println("Hello Finally");

        }






    }



}
