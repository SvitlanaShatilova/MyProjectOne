//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній. У третій масив внесіть результат додавання перших двох, використовуючи методи.

public class AddArrMethod {
    public static void AddingArr(int[][] arr1, int[][] arr2, int[][] arr3){
          for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int[][] arr3 = new int [3][3];
        AddingArr(arr1, arr2, arr3);
    }
}
