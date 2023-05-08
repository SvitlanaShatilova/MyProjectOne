/******************************************************************************
Використовуючи IntelliJ IDEA, створіть клас Arithmetics. Створіть чотири методи
для виконання арифметичних операцій з іменами: add – додавання, sub – віднімання,
mul – множення, div – ділення. Кожен метод має приймати два цілих аргументи та
виводити на екран результат виконання арифметичної операції відповідної імені методу.
Метод поділу div має виконувати перевірку спроби поділу на нуль. Потрібно надати
користувачеві можливість вводити з клавіатури значення операндів і знак арифметичної
операції для виконання обчислень.
*******************************************************************************/
import java.util.Scanner;
public class Arithmetics{
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static int sub(int num1, int num2){
        int difference = num1 - num2;
        return difference;
    }
    public static int mul(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    public static int div(int num1, int num2){
        int share;
        if (num2 == 0){
            System.out.println("Ділення неможливе, замініть дільник");
            return 0;
        }else{
            share = num1 / num2;
            return share;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть значення операнд 1 = ");
        int operand1 = sc.nextInt();
        System.out.println("Введіть значення операнд 2 = ");
        int operand2 = sc.nextInt();
        System.out.println("Введіть знак арифметичної операції для виконання обчислень: 1 – додавання, 2 – віднімання, 3 – множення, 4 – ділення");
        int sing = sc.nextInt();
        switch (sing){
            case(1):
                System.out.println(add(operand1,operand2));
                break;
            case(2):
                System.out.println(sub(operand1,operand2));
                break;
            case(3):
                System.out.println(mul(operand1,operand2));
                break;
            case(4):
                System.out.println(div(operand1,operand2));
                break;
        }
    }
}