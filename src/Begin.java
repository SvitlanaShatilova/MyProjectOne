import java.util.Scanner;

public class Begin {


    public static void main(String[] args) {
// Begin1–. Дана сторона квадрата a. Найти его периметр P = 4*a.
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of the side of the square a: ");
//     int a = sc.nextInt();
//     int P = 4 * a;
//     System.out.println("Периметр квадрата = " + P);

// Begin2–. Дана сторона квадрата a. Найти его площадь S = a2.
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of the side of the square a: ");
//     double a = sc.nextDouble();
//     double S = Math.pow(a, 2);
//     System.out.println("S = " + S);

//Begin3–. Даны стороны прямоугольника a и b. Найти его площадь S = a*b и
//периметр P = 2*(a + b).
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the value a = ");
//    double a = sc.nextDouble();
//    System.out.println("Enter the value b = ");
//    double b = sc.nextDouble();
//    double S = a * b;
//    double P = 2 * (a + b);
//    System.out.println("S = " + S);
//    System.out.println("P = " + P);

//Begin4–. Дан диаметр окружности d. Найти ее длину L = PI * d. В качестве
//значения PI использовать 3.14
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value d = ");
//         double d = sc.nextDouble();
//         double PI = 3.14;
//         double L = PI * d;
//         System.out.println("L = " + L);

//Begin5–. Дана длина ребра куба a. Найти объем куба V = a3 и площадь его
//поверхности S = 6*a2.
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value a = ");
//         double a = sc.nextDouble();
//         double V = Math.pow(a, 3);
//         double S = 6 * Math.pow(a, 2);
//         System.out.println("V = " + V + " S = " + S);

//Begin6–. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти
//его объем V = a*b*c и площадь поверхности S = 2*(a*b + b*c + a*c).
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value a, b, c");
//         double a = sc.nextDouble();
//         double b = sc.nextDouble();
//         double c = sc.nextDouble();
//         double V = a * b * c;
//         double S = 2 * (a * b + b * c + a * c);
//         System.out.println("V = " + V + "; S = " + S);

//Begin7–. Найти длину окружности L и площадь круга S заданного радиуса R:
//L = 2*PI*R, S = PI*R2.
//В качестве значения PI использовать 3.14.
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter R:");
//         double R = sc.nextDouble();
//         double L, S, PI;
//         PI = 3.14;
//         L = 2 * PI * R;
//         S = PI * Math.pow(R, 2);
//         System.out.println("L = " + L + "; S = " + S);

//Begin9–. Даны два неотрицательных числа a и b. Найти их среднее
//геометрическое, то есть квадратный корень из их произведения: .
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Введіть а та b");
//         double a = sc.nextDouble();
//         double b = sc.nextDouble();
//         double c = Math.sqrt(a * b);
//         System.out.println(c);

//Begin10–. Даны два ненулевых числа. Найти сумму, разность, произведение и
//частное их квадратов.
         Scanner sc = new Scanner(System.in);
         System.out.println("Введіть два числа: ");
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double sum = a + b;
         double rizn = a - b;
         double mno = a * b;
         double dil = Math.pow(a, 2) / Math.pow(b, 2);
         System.out.println("Suma = " + sum + "; rizn = " + rizn + "; mno = " + mno + "; dil = " + dil);

    }
}

