package week12._3_wednesday;

public class Task4 {

    public static void main(String[] args) {


        String str = "TechnoStudy";
        str = null;


        try {
            System.out.println(str.toUpperCase());

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }




        System.out.println("Hello World");








    }




}
