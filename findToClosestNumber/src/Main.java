import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0, 12, 40, 55, 28, 76};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int targetNumber = scanner.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < targetNumber && i > closestSmaller) {
                closestSmaller = i;
            }

            if (i > targetNumber && i < closestLarger) {
                closestLarger = i;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı: " + targetNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}
