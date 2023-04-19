public class Lesson1904 {
    public static void main(String[] args) {
        /*Boolean2◦

. Дано целое число A. Проверить истинность высказывания: «Чис-
ло A является нечетным».*/

//        int a = 9;
//        boolean x = (a/2) != 0;
//        System.out.println(x);

        /*Boolean3◦

. Дано целое число A. Проверить истинность высказывания: «Чис-
ло A является четным».*/

//        int a = 10;
//        boolean x = (a%2) == 0;
//        System.out.println(x);

        /*Boolean4◦

. Даны два целых числа: A, B. Проверить истинность высказывания:
«Справедливы неравенства A > 2 и B ≤ 3».*/
//        int a = 3;
//        int b = 2;
//        boolean res = (a>2)&&(b<=3);
//        System.out.println(res);
/*Boolean5◦

. Даны два целых числа: A, B. Проверить истинность высказывания:
«Справедливы неравенства A ≥ 0 или B < −2».*/
//        int a = 3;
//        int b = 2;
//        boolean res = (a>=0) || (b< -2);
//        System.out.println(res);

//        int a = 5;
//        int b = 6;
//        int result = a++ - -b + ++a + b++ +b - a - --a;
//        System.out.println(result);

        /*For1. Даны целые числа K и N (N > 0). Вывести N раз число K.*/

//        int k = 5;
//        int n = 7;
//        for (int i = 0; i < n; i++) {
//            System.out.println(k);
//        }
        /*For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
целые числа, расположенные между A и B (включая сами числа A и B), а
также количество N этих чисел.*/

//        int a = 3;
//        int b = 7;
//        int count = 0;
//        for (int i = a; i <=b ; i++) {
//            System.out.println(i);
//            count++;
//        }
//        System.out.println("count is " + count);

//        int a = 3;
//        int b = 10;
//        int n = 0;
//        for (int i =b-1; i > a; i--) {
//            System.out.println(i);
//            n++;
//        }
//        System.out.println("n is " + n);

//        int n = 64646;
//        int x = 0;
//        for (int i = 10; n > 0; n/=i) {
//            x = n%i;
//            System.out.println(x);

        //       }

        /*For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
2, . . . , 10 кг конфет.*/

//        int price = 5;
//        int konf = 0;
//        for (int i = 1; i <=10 ; i++) {
//            konf = i * price;
//            System.out.println(konf);

        //       }

        /*For5◦
. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
0.2, . . . , 1 кг конфет.*/

//        double price = 5;
//        double konf = 0;
//        for (double i = 0.1; i <=1; i+=0.1) {
//            konf = i * price;
//            System.out.println(konf);
//        }

        /*For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
1.4, . . . , 2 кг конфет.*/
//        double price = 200;
//        double konf = 0;
//        for (double i = 1.2; i <= 2; i += 0.2) {
//            konf = i * price;
//            System.out.println(konf);

/*For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
от A до B включительно.*/

//        int A = 5;
//        int B = 6;
//        int sum = 0;
//        for (int i = A; i <=B ; i++) {
//            sum +=i;
//
//        }
//        System.out.println(sum);

        /*For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
чисел от A до B включительно.*/
        int A = 5;
        int B = 6;
        int res = 1;
        for (int i = A; i <=B; i++) {
            res *=i;
        }
        System.out.println(res);


        }
    }


