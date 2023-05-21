//Використовуючи IntelliJ IDEA, створіть клас Calculator.
// Створіть метод з ім'ям calculate,
// який приймає як параметри три цілочислові значення
// та повертає значення кожного аргументу, поділеного на 5.

public class L_12_Calculator {
        public static void main(String[] args) {

            System.out.println(calculate(10, 20, 30));
        }
        static String calculate(double a, double b, double c) {
            a/=5;
            b/=5;
            c/=5;

            return "a = " + a + " b = " + b + " c = " + c;
        }
    }

