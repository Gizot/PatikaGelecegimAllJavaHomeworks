import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            double x,y,z,u,cevre,alan;
            Scanner input = new Scanner(System.in);
            System.out.println("Aşağıya alanını hesaplamak istediğiniz dik üçgenin dik kenar uzunluklarını girmeniz gerekmektedir.");
            System.out.println("Birinci dik kenar uzunluğunu giriniz:");
            x = input.nextDouble();
            System.out.println("İkinci dik kenar uzunluğunu giriniz:");
            y = input.nextDouble();
            System.out.println("İkinci dik kenar uzunluğunu giriniz:");
            z = input.nextDouble();
            System.out.println("*******************************************");

            u= (x+y+z)/2;

            cevre=2*u;
            System.out.println("Üçgenin çevresi: " + cevre );

            alan= Math.sqrt(u * (u-x) * (u-y) * (u-z));

            System.out.println("Üçgenin alanı: " + alan);
            System.out.println("*******************************************");



    }
}