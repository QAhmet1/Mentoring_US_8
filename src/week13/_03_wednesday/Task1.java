package week13._03_wednesday;

public class Task1 {


    public static void main(String[] args) {
        
        // toLowerCase, toUpperCase, trim, startsWith, endsWith, charAt, replace, index, subString, length contatins, equals ...

        String str = "TechNoStudy";
        // reassighment
        // String is immutable in Java -- Golden Rule: "You can not change the existing value of a string in java"
         //  str = str.toLowerCase();


       String str2 = str.toLowerCase();

       // 1) str =  TechNoStudy
        // 2) str2 = technostudy
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String str3 = "     john doe              ";
        // function of trim : It is removing the spaces from beginnging and form end.
        // If I trim this str3 --> john doe

        str3 = str3.trim();
        System.out.println(str3);

        

        String str4 = "hello java";
        // startsWith (boolean) here you have only 2 options: true/false :
        if (str4.startsWith("hello jA")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        // charAt
        String str7 = "helloTechnoStudy";


        // first Char   --- h
        char firstChar = str7.charAt(0);  // h --- H


        // length
        int length = str7.length();
        //  int indexOfLastCharacter = length-1;


        // last Char
        char lastChar = str7.charAt(str7.length()-1 )     ;
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);



      //  toUpperCase is a String Method. If I want to use toUpperCase I have to conver char to string.
        String firstChar1 = firstChar + "";   // h  -- String
        firstChar1 = firstChar1.toUpperCase();



        // subString (  beginningIndex  , endingIndex);
        // starting point = start from whatever it is (that index is inclueded)
        // ending point = excluded


        String str10 = "hello csharp";  // I want to get hello
        String expectedOutput = str10.substring(0, str10.indexOf(" "));
        System.out.println("expectedOutput = " + expectedOutput);











        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

}
