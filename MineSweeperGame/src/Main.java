import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır ve sütunların sayısının 0'dan başladığını unutma!");

        System.out.print("Satır Sayısını Giriniz: ");
        int rows = input.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        int cols = input.nextInt();

        MineSweeper mineSweeper = new MineSweeper(rows, cols);
        mineSweeper.play();
    }
}

