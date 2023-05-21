/******************************************************************************************
 * Опишіть метод PowerA234(A, B, C, D), який обчислює другий, третій і четвертий ступінь
 * числа A і повертає ці ступені відповідно до змінних B, C і D (A – вхідний, B, C, D –
 * вихідні параметри; усі параметри є дійсними). За допомогою цієї процедури знайдіть
 * другий, третій і четвертий ступені п'яти зазначених чисел.
 *****************************************************************************************/

public class Ex_12_0104 {
    public static String PowerA234(double A, double B, double C, double D){
        B = Math.pow(A, 2);
        C = Math.pow(A, 3);
        D = Math.pow(A, 4);
        return "A^2 = " + B + "; A^3 = " + C + "; A^4 = " + D;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        double num3 = 2.6;
        double num4 = 9.1;
        double num5 = 10.5;

        System.out.println("\n" + PowerA234(num1, num1, num1, num1));
        System.out.println("\n" + PowerA234(num2, num2, num2, num2));
        System.out.println("\n" + PowerA234(num3, num3, num3, num3));
        System.out.println("\n" + PowerA234(num4, num4, num4, num4));
        System.out.println("\n" + PowerA234(num5, num5, num5, num5));
    }
}
