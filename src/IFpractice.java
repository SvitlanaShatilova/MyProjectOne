public class IFpractice {
    public static void main(String[] args) {

/* If1.
Дано целое число. Если оно является положительным, то прибавить к
нему 1; в противном случае не изменять его. Вывести полученное число*/
// 		int num = -5;
// 		if (num > 0){
// 		    num +=1;
// 		}

// 		System.out.println(num);


		/*If2. Дано целое число. Если оно является положительным, то прибавить к
нему 1; в противном случае вычесть из него 2. Вывести полученное число*/

// int num = -6;
// if (num > 0){
//  		    num +=1;
//  		}else{
//  		    num -=2;
//  		}

//  		System.out.println(num);

/*If3. Дано целое число. Если оно является положительным, то прибавить к
нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
заменить его на 10. Вывести полученное число.*/
//     int num = 0;
// if (num > 0){
//  		    num +=1;
//  		}else if (num < 0){
//  		    num -=2;
//  		}else if (num == 0){
//  		    num = 10;
//  		}

//  		System.out.println(num);

                /* If4–. Даны три целых числа. Найти количество положительных чисел в исходном наборе.*/

// int num1 = -5;
// int num2 = 6;
// int num3 = 10;
// int pol = 0;

// if (num1 >0) {
//     pol+=1;
// }
// if (num2 > 0){
//     pol+=1;
// }
// if (num3 > 0){
//     pol+=1;
// }
// System.out.println(pol);

/* If5. Даны три целых числа. Найти количество положительных и количество
отрицательных чисел в исходном наборе*/
//  int num1 = -5;
//  int num2 = 6;
//  int num3 = 10;
//  int pol = 0;
//  int otr = 0;

//  if (num1 >0) {
//      pol+=1;
//  } else { otr+=1;}
//   if (num2 > 0){
//      pol+=1;
//   } else { otr +=1;}
//  if (num3 > 0){
//      pol+=1;
//  } else { otr +=1;}

//  System.out.println(pol);
//  System.out.println(otr);

                /* If6–. Даны два числа. Вывести большее из них*/
// int num1 = 8;
// int num2 = 6;
// if (num1 > num2) {
//     System.out.println("Більше число: " + num1);
// } else {
//     System.out.println("Більше число: " + num2);
// 	}

                /* If7. Даны два числа. Вывести порядковый номер меньшего из них*/

// int num1 = 1;
// int num2 = 6;
// if (num1 > num2) {
//     System.out.println("Менше число: " + num2);
// } else {
//     System.out.println("Менше число: " + num1);
// 	}

//If8–. Даны два числа. Вывести вначале большее, а затем меньшее из них

// int num1 = 9;
// int num2 = 5;
// int max = 0;
// int min = 0;

// if (num1 > num2){
//     max = num1;
//     min = num2;
// } else {
//     max = num2;
//     min = num1;
// }

// System.out.println(max);
// System.out.println(min);

//  int a = 9;
//  int b = 50;
//  System.out.println("max = " + Math.max(a, b) + " min = " + Math.min(a, b));

//If9. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,
//а в B — большее. Вывести новые значения переменных A и B
// int A = 9;
// int B = 5;
// int max = 0;
// int min = 0;

// if (A > B){
//     max = A;
//     min = B;
// } else {
//     max = B;
//     min = A;
//     }
// A = min;
// B = max;
// System.out.println("A = " + A);
// System.out.println("B = " + B);


/*If10. Даны две переменные целого типа: A и B. Если их значения не равны,
то присвоить каждой переменной сумму этих значений, а если равны,
то присвоить переменным нулевые значения. Вывести новые значения
переменных A и B*/
// int A = 55;
// int B = 55;
// int sum = A + B;
// if (A != B) {
//     A = sum;
//     B = sum;
// } else {
//     A = 0;
//     B = 0;
// }
// System.out.println("A = " + A);
// System.out.println("B = " + B);

/*If11. Даны две переменные целого типа: A и B. Если их значения не равны, то
присвоить каждой переменной большее из этих значений, а если равны,
то присвоить переменным нулевые значения. Вывести новые значения
переменных A и B*/
// int a = 11;
// int b = 11;
// if (a != b) {
//     int max = Math.max(a, b);
//     a = max;
//     b = max;
// } else { a = 0;
// b = 0;

// }
// System.out.println("a = " + a + " b = " + b);


//If12–. Даны три числа. Найти наименьшее из них

// int a = 2;
// int b = 6;
// int c = 1;
// int min = 0;

// if ((a<b)&&(a<c)){
//     min = a;
// }else if ((b<a)&&(b<c)){
//     min = b;
// } else {
//     min = c;
// }
// System.out.println("min = " + min);

//Дискримінант D = B^2 - 4ac

                double b = 2;
                double a = 6;
                double c = 8;
                double D;
                double x1 = 0;
                double x2 = 0;

                D = Math.pow(b, 2) - 4 * a * c;
                System.out.println(D);

                if (D < 0) {
                    System.out.println("Коренів немає");
                }
                else if (D == 0){
                    x1 = -b / (2 * a);
                    x2 = -b / (2 * a);
                    System.out.println("X1 = " + x1);
                    System.out.println("X2 = " + x2);
                }
                else if (D > 0){
                    x1 = (-b-Math.sqrt((D)) / (2 * a));
                    x2 = (-b+Math.sqrt((D)) / (2 * a));

                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);




                }
            }
        }




