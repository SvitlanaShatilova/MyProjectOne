import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число від 0 до 100");
        int num = sc.nextInt();
        if (num >= 0 && num <= 14){
            System.out.println("Введене число попадає до числового проміжку [0 - 14]");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Введене число попадає до числового проміжку [15 - 35]");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Введене число попадає до числового проміжку [36 - 50]");
        } else if (num >= 51 && num <= 100) {
            System.out.println("Введене число попадає до числового проміжку [51 - 100]");
        } else {
            System.out.println("Введене число не попадає до жодного з числових проміжків [0 - 14] [15 - 35] [36 - 50] [51 - 100]");
        }
    }
}

