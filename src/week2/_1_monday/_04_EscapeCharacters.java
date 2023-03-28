package week2._1_monday;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
//   \n	It is used to insert a new line in the text at this point.
//   \t	It is used to insert a tab in the text at this point.
//   \'	It is used to insert a single quote character in the text at this point.
//   \"	It is used to insert a double quote character in the text at this point.
//   \r	It is used to insert a carriage return to the text at this point.
//   \\	It is used to insert a backslash character in the text at this point.
//   \f	It is used to insert a form feed in the text at this point.
//   \b	It is used to insert a backspace in the text at this point.

        System.out.println("hel\tlo");
        System.out.println("hel\'lo");
        System.out.println("hel\"lo");
        System.out.println("hel\\lo");
        System.out.println("hel\rlo");
        System.out.println("hel\nlo");
        System.out.println("hel\flo");
        System.out.println("hel\blo");


        // it inserts a Tab Space
        String str = "Ahmet\tDemir";
        System.out.println(str);
//it inserts a New Line
        String str1 = "the best way\nto communicate \nan idea \nis to act it out";
        System.out.println(str1);

//it insert a backslash

        String str2 = "And\\Or";
        System.out.println(str2);
//it insert a Carriage
        String str3 = "Carriage\rReturn";
        System.out.println("rr=  "+str3);
//it prints a single quote
        String str4 = "Wall Street\'s";
        System.out.println(str4);

//it prints double quote
//String str5 = "New\'Twilight'Line";
        String str5 = "'JavaTpoint'";
        System.out.println(str5);


        // Question 1: print  the  "Hello ", "World  \ /"   to screen

    }
}
