public class Volume {
    public static void main(String[] args) {

        double R = 5;
        double h = 10;
        double V = Math.PI * Math.pow(R, 2) * h;
        double S = 2 * Math.PI * Math.pow(R, 2) + 2 * Math.PI * Math.pow(R, 2); // в умові задачі в заданій формулі є помилка
        double s = 2 * Math.PI * R * (R + h);
        System.out.println(V);
        System.out.println(S);
        System.out.println(s);

        double Sp = 2 * Math.PI * Math.pow(R, 2) + 2 * Math.PI * R * h;
        System.out.println(Sp);

    }
}
