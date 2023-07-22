public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Naruto", 10, 120, 100, 40);
        Fighter f2 = new Fighter("Sasuke", 20, 85, 85, 40);

        Match match = new Match(f1, f2, 85,100);
        match.run();
    }
}