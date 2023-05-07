//Використовуючи IntelliJ IDEA, створіть клас Calculator.
// Створіть метод з ім'ям calculate, який приймає як параметри
// три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
public class _Calculator {

    public static void calculate(int value1, int value2, int value3){
        int averageValue = (value1 + value2 + value3)/3;
        System.out.println("Середнє арифметичне = " + averageValue);
    }
    public static void main(String[] args) {
        calculate(20,30,40);
    }
}
