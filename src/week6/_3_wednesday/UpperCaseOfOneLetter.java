package week6._3_wednesday;
/*
Print the first letter of a given string as Upper Case Given "applehouse" Outuput: "A"
*/
public class UpperCaseOfOneLetter {

    public static void main(String[] args) {



        String str = "applehouse";
        String firstChar = str.charAt(0) + "";
        firstChar = firstChar.toUpperCase();
        System.out.println(firstChar);


    }
}
