/*Використовуючи IntelliJ IDEA, створіть клас UserArray. Створити метод, який виконуватиме збільшення довжини масиву,
переданого як аргумент, на 1 елемент. Елементи масиву мають зберегти своє значення та порядок індексів. Створити метод,
який приймає два аргументи, перший аргумент типу int [] array, другий аргумент типу int value. У тілі методу реалізуйте
можливість додавання другого аргументу методу в масив за індексом 0, водночас довжина нового масиву має збільшитися
на 1 елемент, а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.*/

public class UserArray {
    public static void increaseLength(int[] array) {
        int[] increaseArray = new int[array.length+1];
        for (int i = 0; i <= array.length; i++) {
            if (i != array.length) {
                increaseArray[i] = array[i];
            } else {
                increaseArray[i] = 0;
            }
        }
        for (int i : increaseArray) System.out.print(i + " ");
   }
    public static int[] additionValue(int[] array, int value) {
        int[] arrayAdd = new int[array.length+1];
        arrayAdd[0] = value;
        for (int i = 1; i <= array.length; i++){
            arrayAdd[i] = array[i-1];
        }
        return arrayAdd;
    }
    public static void main (String[]args){
        int[] arrayInt = {10, 20, 30, 40, 50, 60, 70};
        increaseLength(arrayInt);
        System.out.println();
        int[] myArray = additionValue(arrayInt, 88);
        for (int i : myArray) System.out.print(i + " ");
    }
}



