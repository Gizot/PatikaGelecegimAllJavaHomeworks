import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int sum = 0;
                int number;

                do {
                    System.out.print("Enter a number (Enter 0 to terminate the program): ");
                    number = scanner.nextInt();

                    if (number % 2 == 0 && number % 4 == 0) {
                        sum += number;
                    }
                } while (number != 0);

                System.out.println("The sum of the entered even and multiple of 4 numbers: " + sum);
            }
        }

