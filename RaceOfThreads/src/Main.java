public class Main {
    public static void main(String[] args) throws InterruptedException {
        Menegament menage = new Menegament();

        Thread t1 = new Thread(menage);
        Thread t2 = new Thread(menage);
        Thread t3 = new Thread(menage);
        Thread t4 = new Thread(menage);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();

        System.out.println("TEKLER  : " + Menegament.odds.size());
        System.out.println();
        System.out.println("ÇİFTLER : " + Menegament.evens.size());

    }
}