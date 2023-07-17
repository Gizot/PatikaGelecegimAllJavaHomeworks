import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

        */

        Scanner scanner = new Scanner(System.in);


        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String[] hayvanSembolleri = { "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };

        int index = dogumYili % 12;
        String zodyakBurcu = hayvanSembolleri[index];

        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);

        scanner.close();
    }
}