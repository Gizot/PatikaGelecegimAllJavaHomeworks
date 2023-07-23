public class Main {
    public static void main(String[] args) {
        double[] numberList = {2,4,6,8,10};
        double harmonicSum = 0.0;
        for(double num : numberList) {
            harmonicSum += 1.0/ num;
        }
        double calculateOfHarmonicSeries = numberList.length/ harmonicSum;
        System.out.println("Harmonic Ortalama: " + calculateOfHarmonicSeries);
    }
}
