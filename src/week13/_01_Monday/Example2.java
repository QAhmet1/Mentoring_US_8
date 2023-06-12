package week13._01_Monday;

public class Example2 {
    public static void main(String[] args) {


        // write a program to convert char array to string
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        //hello
        String s1 = "";
        for (int i = 0; i < ch.length; i++) {
            s1+=ch[i];
        }
        System.out.println("s1 = " + s1);
        String s2=new String(ch);
        System.out.println("s2 = " + s2);
    }



    }


