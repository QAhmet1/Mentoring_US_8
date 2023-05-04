package week7._4_thursday;

//Create a method that can display the initials of the person.    initials(String firstName, String lastName)
// İnput = John Doe Output = J.D


public class Inıtials {  // class level

    public static void main(String[] args) {  // level of main method


        initials("john", "doe");

    }





        public static void initials ( String firstName, String lastName) {

            String initialLetters = firstName.charAt(0) + "." + lastName.charAt(0);
            initialLetters = initialLetters.toUpperCase();
            System.out.println("initialLetters = " + initialLetters);

        }






}
