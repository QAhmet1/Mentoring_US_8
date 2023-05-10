package week8._1_monday._1_monday;
public class Example_1 {
    public static void main(String[] args) {
//        sum(2,3,5,5);
//        sum(2,3);
//        sum(2);
//        sum();

        sum(1);
        sum(1,2);
        sum(1,3,6);
        sum(1,4,5,6);
        sum(1,4,5,6,9,7,8,9,8);
        sum();
    }

//    public static void sum(){
//        System.out.println("called method without parameters");
//    }
    public static void sum(int a){
        System.out.println("total : "+a);
    }public static void sum(double a, int b){
        System.out.println("total : "+(a+b));
    }public static void sum(int a,int b,int c){
        System.out.println("total : "+(a+b+c));
    }public static void sum(int ...numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println("sum = " + sum);

    }


}
