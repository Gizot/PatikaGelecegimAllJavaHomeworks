import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month you were born (as a number): ");
        int month = input.nextInt();

        System.out.print("Enter the day you were born:");
        int day = input.nextInt();

        if(month == 1){
            if (day <= 21){
                System.out.println("Your horoscope: Capricorn");
            } else {
                System.out.println("Your horoscope: Aquarius");
            }
        } else if(month == 2){
            if (day <= 19){
                System.out.println("Your horoscope: Aquarius");
            } else {
                System.out.println("Your horoscope: Pisces");
            }
        } else if(month == 3){
            if (day <= 20){
                System.out.println("Your horoscope: Aquarius");
            } else {
                System.out.println("Your horoscope: Aries");
            }
        } else if(month == 4){
            if (day <= 21){
                System.out.println("Your horoscope: Aries");
            } else {
                System.out.println("Your horoscope: Taurus");
            }
        } else if(month == 5){
            if (day <= 19){
                System.out.println("Your horoscope: Taurus");
            } else {
                System.out.println("Your horoscope: Gemini");
            }
        } else if(month == 6){
            if (day <= 22){
                System.out.println("Your horoscope: Gemini");
            } else {
                System.out.println("Your horoscope: Cancer");
            }
        } else if(month == 7){
            if (day <= 22){
                System.out.println("Your horoscope: Cancer");
            } else {
                System.out.println("Your horoscope: Leo");
            }
        } else if(month == 8){
            if (day <= 22){
                System.out.println("Your horoscope: Leo");
            } else {
                System.out.println("Your horoscope: Virgo");
            }
        } else if(month == 9){
            if (day <= 22){
                System.out.println("Your horoscope: Virgo");
            } else {
                System.out.println("Your horoscope: Libra");
            }
        } else if(month == 10){
            if (day <= 22){
                System.out.println("Your horoscope: Libra");
            } else {
                System.out.println("Your horoscope: Scorpio");
            }
        } else if(month == 11){
            if (day <= 21){
                System.out.println("Your horoscope: Scorpio");
            } else {
                System.out.println("Your horoscope: Sagittarus");
            }
        } else if(month == 12){
            if (day <= 21){
                System.out.println("Your horoscope: Sagittarus");
            } else {
                System.out.println("Your horoscope: Aries");
            }
        }
    }
}