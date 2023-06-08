package week12._4_thursday;

public class Task4 {

        // throws keyword has a disadvantage. When I use this keyword in my custom method, when I tried to call
    //  that custom It will not work. So try catch is permanent solution.


    public static void main(String[] args) {

        Method1();

    }




    public static void Method1( ) {


        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Catch Block");
        }


    }



}
