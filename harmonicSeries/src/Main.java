import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            double toplam = 0;

            for (int i = 1; i <= sayi; i++) {
                toplam += (double) 1 / i;
            }

            System.out.println("Harmonik Seri Toplamı: " + toplam);
    }
}