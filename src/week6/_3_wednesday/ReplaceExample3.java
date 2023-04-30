package week6._3_wednesday;
// Convert the name of domain as "gmail" --> "JohnSmith@yahoo.com";
public class ReplaceExample3 {
    public static void main(String[] args) {


        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail"); //JohnSmith@gmail.com
        System.out.println(email);
    }



}
