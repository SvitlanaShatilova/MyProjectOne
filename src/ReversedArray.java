
/*Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає
   як аргумент масив цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку).
   Створити метод int [] subArray (int [] array, int index, int count). Метод повертає частину отриманого як
   аргумент масиву, починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню
   аргументу count. Якщо аргумент count містить значення більше, ніж кількість елементів, що входять до частини
   вихідного масиву (від зазначеного індексу index до індексу останнього елемента), то під час формування нового
   масиву розмірністю в count, заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.*/

import java.util.Arrays;
public class ReversedArray {
    public static int[] myReverse(int[] array) {
        int[] arrayRevers = new int[5];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrayRevers[index] = array[i];
            index++;

        }return arrayRevers;
    }
    public static int[] subArray(int[] array, int index, int count) {
        int[] arrayPart = new int[count];

        for (int i = 0; i < count; i++) {
            if (index < array.length) {
                arrayPart[i] = array[index];
            }else{
                arrayPart[i] = 1;
            }
            index++;
        }
        return arrayPart;
    }
    public static void main(String[] args) {
        int[] arrayInt = {100, 200, 300, 400, 500};
        int[] arrayRew = myReverse(arrayInt);
        for (int i : arrayRew) System.out.print(i + " ");
        System.out.println();
        int[] myArray = subArray(arrayInt, 4, 10);
        for (int i : myArray) System.out.print(i + " ");
        System.out.println();
        System.out.println(Arrays.toString(arrayRew));
        System.out.println(Arrays.toString(myReverse(arrayInt)));
    }
    }

