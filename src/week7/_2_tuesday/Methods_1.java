package week7._2_tuesday;

import java.util.Scanner;

public class Methods_1 {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int action;
        do {
            menu();
            action=sc.nextInt();
            actionMethod(action);

        }while (action<6);

    }

    public static void menu(){
        System.out.println("***** menu *****");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiply");
        System.out.println("4-Dividing");
        System.out.println("5-Factorial");
        System.out.println("6-Exit");
        System.out.print("Action : ");
    }
    public static void actionMethod(int choose)
    {
        Scanner sc=new Scanner(System.in);
        int number1;
        int number2;

        switch (choose){
            case 1:
                System.out.print("Enter number 1 : ");
                number1=sc.nextInt();
                System.out.print("Enter number 2 : ");
                number2=sc.nextInt();
                adition(number1,number2);
                break;
            case  2:
                System.out.print("Enter number 1 : ");
                number1=sc.nextInt();
                System.out.print("Enter number 2 : ");
                number2=sc.nextInt();
                subtraction(number1,number2);
                break;
            case 3:
                System.out.print("Enter number 1 : ");
                number1=sc.nextInt();
                System.out.print("Enter number 2 : ");
                number2=sc.nextInt();
                multiply(number1,number2);
                break;

            case 4:
                System.out.print("Enter number 1 : ");
                number1=sc.nextInt();
                System.out.print("Enter number 2 : ");
                number2=sc.nextInt();
                dividing(number1,number2);
                break;
            case 5:
                System.out.print("Enter number : ");
                number1=sc.nextInt();
                factorial(number1);
                break;

        }


    }
    public static void adition(int num1,int num2){
        System.out.println("Result of addition : "+(num1+num2));

    }
    public static void subtraction(int num1,int num2){
        System.out.println("Result of subtraction  : "+(num1-num2));

    }

    public static void multiply(int num1,int num2){
        System.out.println("Result of multiplication : "+(num1*num2));

    }
    public static void dividing(int num1,int num2){
        System.out.println("Result of dividing : "+(num1/num2));

    }
    public static void factorial(int num){
        int fac=1;
        // input =5
        // 5*4*3*2*1
        for (int i = num; i >0 ; i--) {
            fac*=i;
        }
        System.out.println("fac = " + fac);


    }



}
