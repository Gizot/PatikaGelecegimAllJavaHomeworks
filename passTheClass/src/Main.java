import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double math, physics, turkish, chemical, music;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your scores: ");

        System.out.println("Math: ");
        math = input.nextDouble();

        System.out.println("Physics: ");
        physics = input.nextDouble();

        System.out.println("Turkish: ");
        turkish = input.nextDouble();

        System.out.println("Chemical: ");
        chemical = input.nextDouble();

        System.out.println("Music: ");
        music = input.nextDouble();

        int validScoreCount = 0; // Geçerli notların sayısını takip etmek için

        double sum = 0;

        if (isValidScore(math)) {
            sum += math;
            validScoreCount++;
        }

        if (isValidScore(physics)) {
            sum += physics;
            validScoreCount++;
        }

        if (isValidScore(turkish)) {
            sum += turkish;
            validScoreCount++;
        }

        if (isValidScore(chemical)) {
            sum += chemical;
            validScoreCount++;
        }

        if (isValidScore(music)) {
            sum += music;
            validScoreCount++;
        }

        if (validScoreCount > 0) {
            double average = sum / validScoreCount;

            if (average <= 55) {
                System.out.println("You failed! \n" + "Average: "  + average + "\nSee You Again Next Year :)");
            } else {
                System.out.println("Congratulations! \n" + "Average: "  + average +"\nPassed :)");
            }
        } else {
            System.out.println("No valid scores entered.");
        }
    }

    public static boolean isValidScore(double score) {
        return score >= 0 && score <= 100;
    }
}
