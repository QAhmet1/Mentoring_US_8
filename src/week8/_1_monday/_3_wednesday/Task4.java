package week8._1_monday._3_wednesday;
// Create a method that finds the unique elements of a  given string.
// This must be a return method, static method
public class Task4 {


    public static void main(String[] args) {

        // applexyappple  -     xy
        // 2,4, --------

        System.out.println(uniqueChars("aaaapplllllleeeeeeeex"));

    }

    public static String uniqueChars (String str) {

        String uniqueChars = "";
        // a   pplexyappple
        // 2   4-----

        for (int i = 0; i < str.length(); i++) {   // Outer Loop

            int count =0;
            for (int j = 0; j < str.length(); j++) {  // İnner Loop
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }


            if (count==1) {
                uniqueChars += str.charAt(i);
            }

        }

        return uniqueChars;

    }

}
