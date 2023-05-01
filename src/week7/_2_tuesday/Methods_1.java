package week7._2_tuesday;

import java.util.Scanner;

public class Methods_1 {
    public static void main(String[] args) {
        // Get the continuous variables by giving the user a menu like below and
        // write each menu item as a function that takes a value.
        /*   1-Addition
             2-Subtraction
             3-Multiply
             4-Dividing
             5-Factorial
             6-Exit
         Select an action
        */

        Scanner sc = new Scanner(System.in);
        int action;

        do {
            menu();
            action = sc.nextInt();
            actionMethod(action);
        } while (action < 6);
    }


    public static void menu() {
        System.out.println("****** Menu *******");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiply");
        System.out.println("4-Dividing");
        System.out.println("5-Factorial");
        System.out.println("6-Exit");
        System.out.print("Action =");
    }

    public static void actionMethod(int choose) {
        Scanner oku = new Scanner(System.in);

        int number1;
        int number2;
        switch (choose) {
            case 1:
                System.out.print("Number 1 : ");
                number1 = oku.nextInt();
                System.out.print("Number 2 : ");
                number2 = oku.nextInt();
                addition(number1, number2);
                break;

            case 2:
                System.out.print("Number 1 : ");
                number1 = oku.nextInt();
                System.out.print("Number 2 : ");
                number2 = oku.nextInt();
                subtraction(number1, number2);
                break;
            case 3:
                System.out.print("Number 1 : ");
                number1 = oku.nextInt();
                System.out.print("Number 2 : ");
                number2 = oku.nextInt();
                multiply(number1, number2);
                break;
            case 4:
                System.out.print("Number 1 : ");
                number1 = oku.nextInt();
                System.out.print("Number 2 : ");
                number2 = oku.nextInt();
                dividing(number1, number2);
                break;

            case 5:
                System.out.print("Number : ");
                number1 = oku.nextInt();
                factorial(number1);
                break;
        }

    }

    public static void addition(int a, int b) {
        System.out.println("Addition result = " + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction result = " + (a - b));
    }
    public static void multiply(int a, int b) {
        System.out.println("Multiply result = " + a * b);
    }
    public static void dividing(int a, int b) {
        System.out.println("Dividing result = " + a / b);
    }
    public static void factorial(int a) {
        int fac = 1;
        for (int i = a; i > 0; i--) {
            fac *= i;
        }
        System.out.println(a + " factorial is " + fac);
    }

}
