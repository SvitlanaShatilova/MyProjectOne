import java.util.Scanner;

public class translator {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введіть слово українською мовою:");
//        String a = sc.nextLine();
//        String x = "сонячно";
//        String x1 = "хмарно";
//        String x2 = "дощовий";
//        String x3 = "вітряний";
//        String x4 = "туманний";
//        String x5 = "холодний";
//        String x6 = "теплий";
//        String x7 = "прохолодний";
//        String x8 = "гарячий";
//        String x9 = "морозний";
//        if (a.equals(x)) {
//            System.out.println("Англійською: Sunny");
//        } else if (a.equals(x1)) {
//            System.out.println("Англійською: Cloudy");
//        } else if (a.equals(x2)) {
//            System.out.println("Англійською: Rainy");
//        } else if (a.equals(x3)) {
//            System.out.println("Англійською: Windy");
//        } else if (a.equals(x4)) {
//            System.out.println("Англійською: Foggy");
//        } else if (a.equals(x5)) {
//            System.out.println("Англійською: Cold");
//        } else if (a.equals(x6)) {
//            System.out.println("Англійською: Warm");
//        } else if (a.equals(x7)) {
//            System.out.println("Англійською: Chilly");
//        } else if (a.equals(x8)) {
//            System.out.println("Англійською: Hot");
//        } else if (a.equals(x9)) {
//            System.out.println("Англійською: Frosty");
//        } else {
//            System.out.println("Немає такого слова");
//        }


    Scanner sc = new Scanner(System.in);
        System.out.println("Введіть слово українською мовою:");
                String a = sc.nextLine();
                switch (a){

                case("сонячно"):
                System.out.println("Англійською: Sunny");
                break;
                case("хмарно"):
                System.out.println("Англійською: Cloudy");
                break;
                case("дощовий"):
                System.out.println("Англійською: Rainy");
                break;
                case("вітряний"):
                System.out.println("Англійською: Windy");
                break;
                case("туманний"):
                System.out.println("Англійською: Foggy");
                break;
                case("холодний"):
                System.out.println("Англійською: Cold");
                break;
                case("теплий"):
                System.out.println("Англійською: Warm");
                break;
                case("прохолодний"):
                System.out.println("Англійською: Chilly");
                break;
                case("гарячий"):
                System.out.println("Англійською: Hot");
                break;
                case("морозний"):
                System.out.println("Англійською: Frosty");
                break;
                default:
                System.out.println("Такого слова немає");
                break;


        }
       }
}