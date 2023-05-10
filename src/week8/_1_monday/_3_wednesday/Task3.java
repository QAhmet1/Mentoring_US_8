package week8._1_monday._3_wednesday;

// Create a method that finds the frequency of a char in the string
// str = "apple" char= 'p' frequency = 2

// This method must be return method / not void

public class Task3 {


    public static void main(String[] args) {



       int freq =  frequency("apple", 'p');
       System.out.println("freq = " + freq);



    }


    public static int frequency (String str, char ch ) {

        int frequency =0;
        String text = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }

        }


        return frequency;

    }









}
