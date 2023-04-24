package week6._1_monday;

public class _01_StringMethods {
    public static void main(String[] args) {

        //TODO  ******  length Method  ****
        String text1="Everyone can make a mistake";
        System.out.println("text1.length() = " + text1.length());

        


        //TODO ******  CharAt Method  ****
        // 
        String text2="Hello world";
        //0123456789
        System.out.println("text2.charAt(0) = " + text2.charAt(0));
        System.out.println("text2.length() = " + text2.length());
        System.out.println("text2.charAt(text2.length()) = " + text2.charAt(text2.length()-1));




        //TODO  ******  Concat Method  ****

        String s1="I am ";
        String s2="a Tester";
        System.out.println(s1.concat(s2));
       String result= s1.concat(s2);
        System.out.println("s1 = " + s1); // ?
        System.out.println("s2 = " + s2); // ?
        System.out.println("result = " + result);







        //TODO  ******  Contains Method  ****

        String text3="Hello Guys";
        boolean istrue=text3.contains("os");
        System.out.println("istrue = " + istrue);
        System.out.println("text3 = " + text3.contains("uys"));
        System.out.println("text3 = " + text3.contains("uy"));
        System.out.println("text3 = " + text3.contains("uysss"));


        //TODO  ******  Equals Method  ****
        String s3="Hello";
        String s4="HELLO";
        String s5="Hello";
        System.out.println(s3.equals(s4));// false
        System.out.println(s3.equals(s5));// True






    }

}
