/**************************************************************************************************************
 * Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
 * (A – вхідний, B – вихідний параметр; обидва параметри є дійсними). За допомогою цієї процедури
 * знайдіть третій ступінь п'яти зазначених чисел.
 **************************************************************************************************************/

public class Ex_11_0104 {

    public static double PowerA3 (double A, double B){
         B = Math.pow(A,3);
         return B;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        double num3 = 2.6;
        double num4 = 9.1;
        double num5 = 10.5;

        System.out.println(PowerA3(num1, num1));
        System.out.println(PowerA3(num2, num2));
        System.out.println(PowerA3(num3, num3));
        System.out.println(PowerA3(num4, num4));
        System.out.println(PowerA3(num5, num5));
    }
}
