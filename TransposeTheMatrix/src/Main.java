public class Main {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4},
                {1, 2, 3},
                {1, 2, 3},
        };
        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 1, 1},
        };

        System.out.println("Matris:");
        printMatrix(matris1);
        System.out.println("Transpoze:");
        printMatrix(transposeMatrix(matris1));

        System.out.println("\nMatris:");
        printMatrix(matris2);
        System.out.println("Transpoze:");
        printMatrix(transposeMatrix(matris2));
    }

    // Matrisi ekrana yazdıran yardımcı metot
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Matrisin transpozunu bulan yardımcı metot
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
