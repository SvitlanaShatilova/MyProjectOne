import java.util.Scanner;

public class L_12_Method {

    static double averageNum (double a, double b, double c){
        double res = (a + b + c)/3;
        return res;
    }
    static double averageNum (double a, double b, double c, double d){
        double res = (a + b + c + d)/4;
        return res;
    }
    static double averageNum (double a, double b, double c, double d, double e){
        double res = (a + b + c + d + e)/5;
        return res;
    }

    static void searchValues (double x, double y, double z) {

        if ((x > y) && (x > z) && (y > z)) {
            System.out.println("Максимальне значення " + x + " Мінімальне значення " + z + " Середнє значення " + y);
        } else if ((x > y) && (x > z) && (z > y)) {
            System.out.println("Максимальне значення " + x + " Мінімальне значення " + y + " Середнє значення " + z);
        } else if ((y > x) && (y > z) && (x > z)) {
            System.out.println("Максимальне значення " + y + " Мінімальне значення " + z + " Середнє значення " + x);
        } else if ((y > x) && (y > z) && (z > x)) {
            System.out.println("Максимальне значення " + y + " Мінімальне значення " + x + " Середнє значення " + z);
        } else if ((z > x) && (z > y) && (x > y)) {
            System.out.println("Максимальне значення " + z + " Мінімальне значення " + y + " Середнє значення " + x);
        } else if ((z > x) && (z > y) && (y > x)) {
            System.out.println("Максимальне значення " + z + " Мінімальне значення " + x + " Середнє значення " + y);
        } else {
            System.out.println("Помилка");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть 3 змінних для методу1 :");
        double var1 = sc.nextDouble();
        double var2 = sc.nextDouble();
        double var3 = sc.nextDouble();

        System.out.println("Внесіть 4 змінних для методу2 :");
        double var4 = sc.nextDouble();
        double var5 = sc.nextDouble();
        double var6 = sc.nextDouble();
        double var7 = sc.nextDouble();

        System.out.println("Внесіть 5 змінних для методу3 :");
        double var8 = sc.nextDouble();
        double var9 = sc.nextDouble();
        double var10 = sc.nextDouble();
        double var11 = sc.nextDouble();
        double var12 = sc.nextDouble();

        System.out.println("Середнє арифметичне число з трьох змінних: " + averageNum(var1,var2,var3));
        System.out.println("Середнє арифметичне число з чотирьох змінних: " + averageNum(var4,var5,var6,var7));
        System.out.println("Середнє арифметичне число з п'яти змінних: " + averageNum(var8,var9,var10,var11,var12));

        double x = averageNum (var1,var2,var3);
        double y = averageNum (var4,var5,var6,var7);
        double z = averageNum (var8,var9,var10,var11,var12);

        searchValues(x,y,z);

    }
}


