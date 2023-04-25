package week6._2_tuesday;

public class _01_StringMethods {
    public static void main(String[] args) {
        //TODO EqualIgnoreCase
        // Compare 2 strings without any case
        // The result is a boolean

        String s1="hello";
        String s2="HELLO";
        System.out.println("first : " +s1.equals(s2));//f
        System.out.println("second : " +s1.equalsIgnoreCase(s2));//t
        System.out.println("thirth : " +s1.equalsIgnoreCase("HeLlO"));//t

        //TODO IndexOf
        String s3="Hello World";
        System.out.println(s3.indexOf("o"));// 4
        System.out.println(s3.indexOf("s"));// -1 means not exist
        System.out.println(s3.indexOf("o "));//

        // TODO isEmpty

        String s4="Hi";
        String s5="";
        System.out.println(s4.isEmpty());// f
        System.out.println(s5.isEmpty());// t

        //TODO LastIndexOf

        String s6="Hello world";
        //         012345678910
        System.out.println(s6.indexOf("o"));// 4
        System.out.println(s6.lastIndexOf("o"));// 4

        //TODO substring
        String s7="Hello Guys";
        System.out.println(s7.substring(2));// llo Guys
        System.out.println(s7.substring(2,7));// llo G






    }


}
