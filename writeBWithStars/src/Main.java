public class Main {
    public static void main(String[] args) {
        String[][] list = new String[6][4];

        // B harfi deseni oluşturma
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    list[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    list[i][j] = " * ";
                } else {
                    list[i][j] = "   ";
                }
            }
        }

        // Deseni ekrana yazdırma
        for (String[] row : list) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
