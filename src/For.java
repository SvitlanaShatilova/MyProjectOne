public class For {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Counter = " + i);

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Counter = " + i);
//
//            if (i==3) break;
//            System.out.println("Цей рядок не виконується");

//            for (int i = 0; i < 5; i++) {
//                System.out.println("Counter = " + i);
//
//                if (true) break;
//                System.out.println("Цей рядок не виконується");

//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Counter = " + i);
//
//                    if (true) continue;
//                    System.out.println("Цей рядок не виконується");

//        for (int i = 0; i < 10; i++) {
//
//            //Виводимо один рядок із 9 зірочок.
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//
//            }
//            //Перехід на новий рядок.
//            System.out.println();
//        }

        //ex 1
//        int n = 7;
//        int k = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.println(k);
//        }

        //ex 2
//        int a = 7;
//        int b = 15;
//        int n = 0;
//        for (int i = a; i <= b; i++) {
//            System.out.println(i);
//            n++;
//        }
//        System.out.println(n);

        //ex 3
//        int a = 7;
//        int b = 15;
//        int n = 0;
//        for (int i = (b-1); i > a; i--) {
//            System.out.println(i);
//            n++;
//        }
//        System.out.println(n);

        //ex 4
//        double price = 177.75;
//        for (int i = 1; i < 10; i++) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //ex 5
//        double price = 177.75;
//        for (double i = 0.1; i <=1; i+=0.1) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //ex 6
//        double price = 177.55;
//        for (double i = 1.2; i <= 2; i += 0.2) {
//            double totalPrice = i * price;
//            System.out.println(totalPrice);
//        }

        //ex 7
        int a = 7;
        int b = 10;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
            System.out.println(sum);

    }
}
