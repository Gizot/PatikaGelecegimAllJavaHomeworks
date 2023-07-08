import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight,height, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your \"weight (kg)\": ");
        weight = input.nextDouble();
        System.out.println("Please, enter your \"height (m)\": ");
        height = input.nextDouble();

        bodyMassIndex = weight/ Math.pow(height,2);

        System.out.println("Your Body Mass Index: " + bodyMassIndex);
        boolean isHealthy = bodyMassIndex >= 18 && bodyMassIndex <= 25;
        String result = isHealthy ? "HEALTHY" : "UNHEALTHY";
        System.out.println(result);
        System.out.println("*****************You should consult an expert for a professional evaluation. :) **************");


    }
}