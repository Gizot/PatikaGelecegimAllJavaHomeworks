import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the product price: ");

            tutar = input.nextDouble();
        }

        double kdvOrani = (tutar > 0 && tutar <= 1000) ? 0.18 : 0.08;


        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;

        System.out.println("Value Added Tax(VAT): " + kdvOrani );

        System.out.println("Value Added Tax Amount: " + kdvTutari );

        System.out.println("Product Price with VAT: " + kdvliTutar );


    }

}
