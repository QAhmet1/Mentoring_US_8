package week8._4_thursday;

// Create a method that retrieves digits from string -->  String str = “as5kkbkk23444” output = "523444"
//// It must be; 1) Return Method 2) Static Method

public class Task1 {

    public static void main(String[] args) {


       String str2 = retriveNumbers("kjldsfkj0932900249042");
        System.out.println("str2 = " + str2);


    }
    
    
    public static String retriveNumbers (String str ) {
        
        String numbers = "";  // I am gonna fill out this with digits/numbers

        for (int i = 0; i < str.length(); i++) {
            
            if (Character.isDigit(str.charAt(i))) {    // Character.isDigit, Character.isLetter, Character.isUpperCase
                numbers += str.charAt(i);
            }
        }
        
        return numbers;
        
    }


    public void sum () {   // If there is no "static" keyword this means this is instance method
        System.out.println("Hello World");
    }
    
    
    
    
    
    

}
