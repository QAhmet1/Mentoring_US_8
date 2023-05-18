package week9._4_thursday;

public class Task1 {

    // I am gonna prefer instance methods ( non-static)


    public void sum (int num1, int num2) {
        System.out.println(num1 + num2);
        // This is an instance (non -static) method

    }

    void division (double num1, double num2) {

        System.out.println(num1/num2);
        // Acc.Mod is default,  instance method, parameterized method, void method
    }


    protected void subtraction (int num1, int num2) {

        System.out.println(num1-num2);
        // acc. protected
    }


    private void hello () {
        System.out.println("Hello World");
        // acc. private + non static + void + no parameter
    }


    public static void main(String[] args) {

        // This is the area to call methods
        // If method/variable is non-static, to call them I need to create object
        // How to creat object

        // ClassName randomobjname = new ClassName ();

        Task1 x = new Task1();
        x.division(12,3);
        x.sum(10,20);    x.hello();










    }











}
