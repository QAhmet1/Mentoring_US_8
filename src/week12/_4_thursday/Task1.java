package week12._4_thursday;

public class Task1 {

    public static void main(String[] args)   {

        // 1) Checked Exceptions
        // Thread.sleep() ,
        // Happens during Compile Time (red line over the code)
        // Handling Ways: 1) Try Catch , 2) throws

           // 2) Unchecked Exception ( Runtime Exceptions    )
        // Arithmetic Exception,
        // Happens during runtime (unexpected)
        // Handling Ways: Only Try Catch


        int a = 20;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello");

        System.out.println("--------------------------------");


        try {
            System.out.println(2/0);
        } catch (Exception e){
            System.out.println("Catch Block");
        }




















    }


}
