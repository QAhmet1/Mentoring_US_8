package week4._1_monday;

import java.util.Arrays;

public class Example3 {
    //Define an array with 5 elements, numbers up to 10
    //Fill in randomly.
    //Then print it with a separate loop.
    public static void main(String[] args) {
        int[] number=new int[5];
        for (int i = 0; i < number.length ; i++) {
            number[i]= (int) (Math.random()*11);

        }
        System.out.println("Arrays.toString(number) = " + Arrays.toString(number));
        for (int j : number) {
            System.out.println("number = " + j);

        }
    }

}
