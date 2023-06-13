package week13._02_tuesday;

public class _1 {
    public static void main(String[] args) {
        //Given the following code, which expression displays the word "Equal"?
        String s1="Java";
        String s2="java";
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
