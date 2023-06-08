package week12._4_thursday;

public class Task2 {

    public static void main(String[] args) {

        // When does catch block get executed?
        // Answer: If I have exception.




        try {

            System.out.println(4/0);

        } catch (Exception e){
            System.out.println("Catch Block");
            // cathc block gives detail about exception If I do not handle any exception It will not work
        }




    }


}
