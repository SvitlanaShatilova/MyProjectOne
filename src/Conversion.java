import java.util.Scanner;

/********************************************************************************************************************
 Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти.
 Користувач вводить:
  1) суму грошей у певній валюті;
  2) курс конвертації в іншу валюту.
 Організуйте виведення результату операції конвертування валюти на екран.
 *******************************************************************************************************************/

public class Conversion {
    public static double Сonverting (double value1, double value2){
        double res = value1 * value2;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму коштів для конвертації: ");
        double amount = sc.nextDouble();
        System.out.println("Введіть курс конвертації валюти: ");
        double exchange = sc.nextDouble();
        System.out.println("Результат операції: " + Сonverting(amount, exchange));
    }
}
/******************************************************************************************************************
 * Якщо в методі змінна використувається тільки для запису в неї результату якихось дій і повернення -
 * то єю можна знехтувати
 * Замість
 *
 *     public static double сonverting (double value1, double value2){
 *  int res = value1 * value2;
 *         return res;
 *     }
 *
 * Можна написати ось так
 *
 *     public static double сonverting (double value1, double value2){
 *  return value1 * value2;
 *     }
 *****************************************************************************************************************/