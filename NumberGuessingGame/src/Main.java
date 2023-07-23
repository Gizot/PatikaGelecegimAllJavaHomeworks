import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz (0-99 arası): ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Hatalı giriş. Lütfen 0-99 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ettiniz! Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Doğru sayıyı bulamadınız!");

                // Tahminin daha yakın mı uzak mı olduğunu kontrol etme
                if (Math.abs(selected - number) <= 5) {
                    System.out.println("Bulmanız gereken sayıya çok yakınsınız!");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan " + (selected > number ? "büyük" : "küçük") + "tür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli sayı: " + number);
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }

    }
}
