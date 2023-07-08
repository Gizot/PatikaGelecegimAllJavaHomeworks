import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                double armut,elma,domates, muz,patlıcan,
        armutKg,elmaKg,domatesKg,muzKg,patlıcanKg, total;
                armut = 2.14;
                elma = 3.67;
                domates = 1.11;
                muz = 0.95;
                patlıcan = 5.00;

                Scanner input = new Scanner(System.in);
        System.out.println("Armut kg bilgisini giriniz: ");
                armutKg = input.nextDouble();
        System.out.println("Elma kg bilgisini giriniz: ");
                elmaKg = input.nextDouble();
        System.out.println("Domates kg bilgisini giriniz: ");
                domatesKg = input.nextDouble();
        System.out.println("Muz kg bilgisini giriniz: ");
                muzKg = input.nextDouble();
        System.out.println("Patlıcan kg bilgisini giriniz:");
                patlıcanKg = input.nextDouble();

                total = (armut*armutKg) + (elma * elmaKg)
                        + (domates*domatesKg) + (muz*muzKg) + (patlıcan * patlıcanKg);
        System.out.println("Toplam tutar: " + total + " TL");




    }
}