import java.util.Scanner;

public class Lesson2904 {
//    public static void main(String[] args) {
//        public class Main
//        {
//            public static int Meth (int a, int b){
//                int c = a+b;
//                return c;
//            }
//
//            public static void Meth (int a, int b){ //у войді є певні правила,
//                //ми не можемо до них застосувати при виклику - не можемо перенести кудись або дати якесь значення для змінної
//                int c = a+b;

//            }
//
//            public static void main(String[] args) { //при виклику методу ми щось можемо або не можемо
//
//                Meth (7,8);
//
//                System.out.println("Hello World");
//            }
//        }
//практика
//        public class Main
//        {
            // два методи з 2 і 5 параметрами.
            //знайти середнє арифметичне між ними

//     static double middle (double a, double b){
//         double c = 0;
//         c = (a+b)/2;
//         return c;
//     }

//     static double middle (double a, double b, double c, double e, double f){
//         double i =0;
//         i = (a+b+c+e+f)/5;
//         return i;
//     }

//     static double maxmiddle(){
//         double max = Math.max(middle (22,22), middle (3,4,5,6,7));
//         return max;
//     }


// 	public static void main(String[] args) {
// 	    double a = 1;
// 	    double b = 2;
// 	    double c = 5;
// 	    double e = 6;
// 	    double f = 7;


// 		System.out.println(middle (a,b));
// 		System.out.println(middle (a,b,c,e,f));
// 		System.out.println(maxmiddle());


// 		public static void sum (int a, int b){
// 		    System.out.println(a+b);
// 		}
// 			public static void sum (double a, int b){
// 		    System.out.println(a+b);
// 			}
// 				public static void sum (int a, double b){
// 		    System.out.println(a+b);
// 				}
// 					public static void sum (double a, double b){
// 		    System.out.println(a+b);
// 					}

// 					public static void minus (int a, int b){
// 		    System.out.println(a-b);
// 		}
// 			public static void minus (double a, int b){
// 		    System.out.println(a-b);
// 			}
// 				public static void minus (int a, double b){
// 		    System.out.println(a-b);
// 				}
// 					public static void minus (double a, double b){
// 		    System.out.println(a-b);
// 					}

// 				public static void mult (int a, int b){
// 		    System.out.println(a*b);
// 		}
// 			public static void mult (double a, int b){
// 		    System.out.println(a*b);
// 			}
// 				public static void mult (int a, double b){
// 		    System.out.println(a*b);
// 				}
// 					public static void mult (double a, double b){
// 		    System.out.println(a*b);
// 					}

// 			public static void div (int a, int b){
// 		    System.out.println(a/b);
// 		}
// 			public static void div (double a, int b){
// 		    System.out.println(a/b);
// 			}
// 				public static void div (int a, double b){
// 		    System.out.println(a/b);
// 				}
// 					public static void div (double a, double b){
// 		    System.out.println(a/b);
// 					}

// 		public static void sqrt (int a){
// 		    System.out.println(Math.sqrt(a));
// 		}
// 			public static void sqrt (double a){
// 		     System.out.println(Math.sqrt(a));
// 			}

// 				public static void pow (int a, int b){
// 		    System.out.println(Math.pow(a,b));
// 		}
// 			public static void pow (double a, int b){
// 		     System.out.println(Math.pow(a,b));
// 			}



// 		public static void main(String[] args) {
// 		sum(2,3);
// 		pow(5,2);
// 		div(6,3);
// 		sqrt(9);

//знайти максимальну і мінімальну змінну, використвувати return.

//     public static String maxValue (int a, int b){
//         if (a>b){
//             return "a більше b";
//         }else if (a<b){
//             return "a менше b";
//         }else{
//             return "значення рівні";
//         }
//     }

//     public static String maxValue (double a, int b){
//         if (a>b){
//             return "a більше b";
//         }else if (a<b){
//             return "a менше b";
//         }else{
//             return "значення рівні";
//         }
//     }
//     public static String maxValue (double a, double b){
//         if (a>b){
//             return "a більше b";
//         }else if (a<b){
//             return "a менше b";
//         }else{
//             return "значення рівні";
//         }
//     }

//      public static String maxValue (int a, double b){
//         if (a>b){
//             return "a більше b";
//         }else if (a<b){
//             return "a менше b";
//         }else{
//             return "значення рівні";
//         }
//      }

// public static void main(String[] args) {
//     String res = maxValue(12,12);

// System.out.println(res);

// Вивести N раз число K

//     public static void myMethod (int n, int k){
//         for (int i = 0; i<n; i++){
//             System.out.println(k);
//         }
//     }

// 		public static void main(String[] args) {
// 		    myMethod(5,3);


// масиви

//             static int [] array (int[]myArray){
//                 int[] sum = new int [1];
//                 for (int i = 0; i < myArray.length; i++){
//                     sum [0] +=myArray[i];
//                 }
//                 return sum;
//             }
//
//             public static void main(String[] args) {
//                 int[] array1 = {100, 200, 500, 1000};
//                 int[] res = array(array1);
//                 System.out.println(res[0]);
//             }


//користувач поповнює рахунок, але банки беруть %, підрахувати
            //0% поовнення, та 2 метода підраховують =
            //сума внесення =
            // а сума зарахування сума внесеня - 5% (3%)
            // % становить =


//    static int array (int[]myArray){
//        int sum = 0;
//        for (int i = 0; i < myArray.length; i++){
//            sum +=myArray[i];
//        }
//        return sum;
//    }
//    public static double calcDeposit(int[] deposit){
//        int count_deposit = 0;
//       int res = array(deposit);
//        double persent = res*0.05;
//
//        return persent;
//    }
//    public static double totalDeposit(int[] deposit){
//
//        double total = array(deposit)-calcDeposit(deposit);
//
//        return total;
//    }
//    public static void main(String[] args) {
//        int[] array1 = {100, 200, 500, 1000};
//        int res = array(array1);
//       // System.out.println(res);
//
//
//        System.out.println(array(array1));
//        System.out.println(calcDeposit(array1));
//        System.out.println(totalDeposit(array1));
//   }

    //методи перетворювати з 10-го числа у двійковий формат
    // з десяткової до вісімкової системи числення


    public static void visim(int number){
        int test;
        test = number % 8;
        if (number>=8) visim(number/8);
        System.out.println(test);
    }

    public static void dviik(int number){
        int test;
        test = number % 2;
        if (number>=2) dviik(number/2);
        System.out.println(test);

    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int number = scanner.nextInt();
    //dviik((number));
        //System.out.println();
   // visim((number));
rozryadRecursion(number);
    }

    public static void rozryadRecursion(int number){

        int rozryad;
        rozryad = number %10;
        if (number>0) rozryadRecursion(number/10);

        System.out.println(rozryad);
    }


}

//зробити програму приймати певне число і розбивати на розряди
//за допомогою рекурсії (ми раніше робили циклами)



