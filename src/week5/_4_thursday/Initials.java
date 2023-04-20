package week5._4_thursday;

/*
        Print the 1.st letter of names in the array
        String  [] names = {"Elminur", "Ali", "Hulya", "Simen", "Begench", "Ruveyda",
                "Jonathan", "Alshaun", "Manas", "Gulsen"};
        Ex: E
            A
            H
            S
            B
            ..

 */

public class Initials {

    public static void main(String[] args) {

        String  [] names = {"Elminur", "Ali", "Hulya", "Simen", "Begench", "Ruveyda",
                "Jonathan", "Alshaun", "Manas", "Gulsen"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].charAt(0));

        }


    }


}
