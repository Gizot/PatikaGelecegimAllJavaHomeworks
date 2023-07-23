import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private char[][] gameBoard;
    private boolean[][] mineBoard;
    private int rows;
    private int cols;
    private int remainingCells;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        gameBoard = new char[rows][cols];
        mineBoard = new boolean[rows][cols];
        remainingCells = rows * cols - rows * cols / 4; // %25 of cells will be mines
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                gameBoard[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int mineCount = rows * cols / 4;

        while (mineCount > 0) {
            int randRow = random.nextInt(rows);
            int randCol = random.nextInt(cols);

            if (!mineBoard[randRow][randCol]) {
                mineBoard[randRow][randCol] = true;
                mineCount--;
            }
        }
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValidCell(newRow, newCol) && mineBoard[newRow][newCol]) {
                count++;
            }
        }

        return count;
    }

    public void play() {
        Scanner input = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        printBoard();

        while (remainingCells > 0) {
            System.out.print("Satır Giriniz: ");
            int row = input.nextInt();
            System.out.print("Sütun Giriniz: ");
            int col = input.nextInt();

            if (!isValidCell(row, col)) {
                System.out.println("Geçersiz koordinat! Lütfen tekrar deneyin.");
                continue;
            }

            if (mineBoard[row][col]) {
                System.out.println("Game Over!!");
                revealBoard();
                printBoard();
                return;
            }

            int mines = countAdjacentMines(row, col);
            gameBoard[row][col] = (char) (mines + '0');
            remainingCells--;
            printBoard();
        }

        System.out.println("Oyunu Kazandınız!");
        revealBoard();
        printBoard();
    }

    private void printBoard() {
        System.out.println("Mayın Tarlası");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===========================");
    }

    private void revealBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineBoard[i][j]) {
                    gameBoard[i][j] = '*';
                } else {
                    gameBoard[i][j] = (char) (countAdjacentMines(i, j) + '0');
                }
            }
        }
    }
}