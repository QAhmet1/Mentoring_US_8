package week12._3_wednesday;

public class Task6 {

    public static void main(String[] args) {


        String str = "TechnoStudy";

        try {
            System.out.println(str.substring(2,0));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }






    }


}
