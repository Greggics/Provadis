package aufgabe59;

public class Calc {

    public static double sum(double num1, double num2){
        return num1+num2;
    }
    public static double subtract(double num1, double num2){
        return num1-num2;
    }
    public static double mul(double num1, double num2){
        return num1*num2;
    }
    public static double div(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        System.out.println(Calc.sum(1,2));
        System.out.println(Calc.subtract(1,2));
        System.out.println(Calc.mul(1,2));
        System.out.println(Calc.div(1,2));
    }
}
