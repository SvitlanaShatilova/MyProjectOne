public class Printing_Shapes {
    public static void main(String[] args) {
        final int width = 30;  //ширина
        final int height = 20; //висота
        final String emptySymbol = " ";
        final String fillSymbol = "*";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                String symbol = emptySymbol;
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    symbol = fillSymbol;
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                String symbol = emptySymbol;
                if (i == height - 1 || j == 0 || (j + 1) == i + 1) {
                    symbol = fillSymbol;
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 0; i <= height / 2; i++) {
            for (int j = 0; j <= height; j++) {
                String symbol = emptySymbol;
                if (j == height / 2 + i || j == height / 2 - i || i == height / 2) {
                    symbol = fillSymbol;
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 0; i <= height / 2; i++) {
            for (int j = 0; j <= height; j++) {
                String symbol = emptySymbol;
                if (j == height / 2 + i || j == height / 2 - i) {
                    symbol = fillSymbol;
                }
                System.out.print(symbol);

            }
            System.out.println();
        }
        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j <= height; j++) {
                String symbol = emptySymbol;
                if (j == height / 2 + i || j == height / 2 - i) {
                    symbol = fillSymbol;
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}



