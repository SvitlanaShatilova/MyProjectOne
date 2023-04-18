import java.util.Scanner;

public class L_12_Dostavka {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Для розрахунку наявних маршрутів введіть кількість клієнтів: ");
            int client = sc.nextInt();
            int route = factorial(client);

            System.out.println("Для доставки товару пропонується " + route + " варіантів маршрутів");
        }

        public static int factorial(int N) {

            if (N >= 1) {
                return N * factorial(N - 1);
            } else {
                return 1;
            }
        }
    }

//Рекурсію не бажано використовувати оскільки вона забирає дуже багато памяті.

//Подібно до того, як цикли можуть зіткнутися з проблемою нескінченного циклу,
//рекурсивні функції можуть зіткнутися з проблемою нескінченної рекурсії.
//Нескінченна рекурсія — це коли функція ніколи не припиняє викликати саму себе.
//Кожна рекурсивна функція повинна мати умову зупинки, яка є умовою, коли функція
//припиняє викликати саму себе.




