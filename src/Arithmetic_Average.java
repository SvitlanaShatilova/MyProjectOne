public class Arithmetic_Average {
    public static void main(String[] args) {

        int integer1 = 5;
        int integer2 = 8;
        int integer3 = 10;
        int average;
        average = (integer1 + integer2 + integer3) / 3;
        System.out.println(average);

        double average2;
        average2 = (integer1 + integer2 + integer3) / 3;
        System.out.println(average2);

        double integer11 = 0;
        double integer22 = 0;
        double integer33 = 0;
        integer11 = (double) integer1;
        integer22 = (double) integer2;
        integer33 = (double) integer3;
        double average3 = (integer11 + integer22 + integer33) / 3;
        System.out.println(average3);
    }
}