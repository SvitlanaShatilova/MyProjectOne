import java.util.Scanner;
public class L_12_Bank {
    static void myBank(int payment){
        int credit = 700;
        int borg = credit - payment;
        System.out.println("Всього видано кредит на суму " + credit);
        System.out.println("Погашено заборгованість на загальну суму " + payment);
        if (borg > 0){
            System.out.println("Сума заборгованості складає " + borg);
        }
        else if (borg < 0){
            System.out.println("Переплата за кредитом складає " + borg);
        }else{
            System.out.println("Заборгованість відсутня");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внесіть суму платежу1: ");
        int pay = sc.nextInt();
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу2: ");
        int pay2 = sc.nextInt();
        pay += pay2;
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу3: ");
        int pay3 = sc.nextInt();
        pay += pay3;
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу4: ");
        int pay4 = sc.nextInt();
        pay += pay4;
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу5: ");
        int pay5 = sc.nextInt();
        pay += pay5;
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу6: ");
        int pay6 = sc.nextInt();
        pay += pay6;
        myBank(pay);
        System.out.println();
        System.out.println("Внесіть суму платежу7: ");
        int pay7 = sc.nextInt();
        pay += pay7;
        myBank(pay);
    }
}



