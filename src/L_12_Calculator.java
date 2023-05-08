//Використовуючи IntelliJ IDEA, створіть клас Calculator.
// Створіть метод з ім'ям calculate,
// який приймає як параметри три цілочислові значення
// та повертає значення кожного аргументу, поділеного на 5.

public class L_12_Calculator {
        public static void main(String[] args) {
            calculate(10, 20, 30);
        }
        static void calculate(int a, int b, int c) {
            a/=5;
            b/=5;
            c/=5;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }

