package week6._4_thursday;

// Print only the domain name from the given string  "johndoe@gmail.com"  --> Output : gmail

public class SubString {
    public static void main(String[] args) {
        
        
        String str = "johndoe@gmail.com";
        int beginningIndex = str.indexOf("@") +1; // index including.
        int endingIndex = str.indexOf(".");  // index excluding
        String domain = str.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);
        
       
        
        
        
        
        
        
        
        
    }
}
