package week6._4_thursday;

/*
 String text = "2094904439rememeeejlkjew**2*2*";
 Retrive numbers, letters and special chars and print each group with different variables..
 */

public class RetriveCharacters {


    public static void main(String[] args) {


        String text = "2094904439rememeeejlkjew**2*2*";

        String letter = "";
        String digit = "";
        String specialChar = "";


        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                letter += text.charAt(i);
            } else if (Character.isDigit(text.charAt(i))) {
                digit += text.charAt(i);
            } else {
                specialChar += text.charAt(i);
            }
        }


        System.out.println("digit = " + digit);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);






    }


}
