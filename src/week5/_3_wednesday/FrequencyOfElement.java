package week5._3_wednesday;

public class FrequencyOfElement {

    public static void main(String[] args) {

        //  Find the count of x in the string "helloxXhello";

        String str = "helloxXhello";

        // What is output --> 2  --> integer number
        int countOfX = 0; // temporary value as zero
        char [] arr = str.toCharArray(); // converted the given string  to char array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'x' || arr[i]== 'X') {
                countOfX++;
            }
        }
        System.out.println("countOfX = " + countOfX);














    }


}
