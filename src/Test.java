public class Test {
    public static void calculate (int a, int b, int c){
        double result = (double) (a+b+c) /3;  // double result = (a+b+c) /3.0;
        System.out.println(result);
    }



    public static void main(String[] args) {
        calculate (2,4,4);
    }
}
