//Використовуючи IntelliJ IDEA, створіть клас Arrays.
// Створіть масив розмірністю 10 елементів,
// виведіть на екран усі елементи масиву у зворотному порядку.
public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
