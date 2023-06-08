package week12._3_wednesday;

public class Task5 {

    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6};

       try {
           System.out.println(arr[11]);
       } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
           System.out.println(e.getMessage());
       }



        System.out.println("Hello World");





    }



}
