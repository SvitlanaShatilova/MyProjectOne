import java.util.Scanner;
public class Calculator {

        public static void main(String[] args) {

            int operand1 = 4;

            int operand2 = 0;

            System.out.println("Введіть знак арифметичної операції:");

            Scanner sc = new Scanner(System.in);

            String sing = sc.next();

            switch (sing){

                case "+":

                    System.out.println(operand1 + operand2);

                    break;

                case "-":

                    System.out.println(operand1 - operand2);

                    break;

                case "*":

                    System.out.println(operand1 * operand2);

                    break;

                case "%":

                    System.out.println(operand1 % operand2);

                    break;

                case "+=":

                    System.out.println(operand1 += operand2);

                    break;

                case "-=":

                    System.out.println(operand1 -= operand2);

                    break;

                case "*=":

                    System.out.println(operand1 *= operand2);

                    break;

                case "/=":

                    System.out.println(operand1 /= operand2);

                    break;

                case "%=":

                    System.out.println(operand1 %= operand2);

                    break;

                case "++":

                    System.out.println(operand1++);

                    System.out.println(++operand2);

                    break;

                case "--":

                    System.out.println(operand1--);

                    System.out.println(--operand2);

                    break;

                case "/":

                    if (operand2 == 0){

                        System.out.println("Error: Ділення на 0 неможливе");

                    } else {

                        System.out.println(operand1 / operand2);

                    }

                    break;

                default:

                    System.out.println("Введене значення не відповідає знаку арифметичної операції");

                    break;

            }

        }

    }
