import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                int toplam = 0;

                for (int i = 1; i < number; i++) {
                    if (number % i == 0) {
                        toplam += i;
                    }
                }

                if (toplam == number) {
                    System.out.println(number + " Perfect Number");
                } else {
                    System.out.println(number + " Not a perfect number");
                }
            }

}