import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (isPalindrom(number)) {
                    System.out.println(number + " is a palindrome number.");
                } else {
                    System.out.println(number + " is not a palindrome number.");
                }
            }

            public static boolean isPalindrom(int number) {
                int invertednumber = 0;
                int temp = number;

                while (temp != 0) {
                    int kalan = temp % 10;
                    invertednumber = invertednumber * 10 + kalan;
                    temp = temp / 10;
                }

                if (number == invertednumber) {
                    return true;
                } else {
                    return false;
                }
            }
        }