package week7._4_thursday;

// Create a method that can display the domain of the email

public class DomainName {

    public static void main(String[] args) {

       /*

        String mail = "johndoe@gmail.com";

        int firstIndex= mail.indexOf("g");
        int lastIndex = mail.indexOf(".");

        String domain = mail.substring(firstIndex, lastIndex);


        System.out.println(domain);
*/


        domainOfEmail("helloj930930993ava@hotmail.com");





    }


    // johndoe@gmail.com

    public static void domainOfEmail (String email ) {

        // substring -- to get a string from a string
        // First Index = Including
        // Ending Index = Excluding

        // johndoe@gmail.com   gmai

        int firstIndex = email.indexOf("@")  + 1;   // index of g including
        int lastIndex = email.indexOf(".");  // excluding

        String domainName = email.substring(firstIndex, lastIndex);

        System.out.println("domainName = " + domainName);

    }




}


