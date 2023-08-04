import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fixture  {
    // Fixture sınıfı, takımlar arasındaki maçların fikstürünü oluşturan sınıftır.
// Listeler kullanarak ilk ve ikinci yarı fikstürleri tutar.
    List<Team> teams;  // Takımları tutacak liste
    List<String> fRounds, sRounds; // İlk ve ikinci yarı fikstür listeleri

    // Maç turunu belirlemek için bir sayaç oluşturuldu.
    private static int sc = 1;

    public Fixture(List<Team> teams) { // Constructor, Fixture nesnesi oluşturulurken takımları alır ve
        // ilk ve ikinci yarı fikstür listelerini oluşturur.
        this.teams = teams;
        fRounds = new ArrayList<>();
        sRounds = new ArrayList<>();

    }
    // Fikstürü oluşturan metod
    public void generate() {
        Random random = new Random(123); // 123 seed değeri ile oluşturulur
        int half = (teams.size() * (teams.size() - 1)) / 2;
        int counter = 0;// Maç sayaç değişkeni
        // Eğer takım sayısı çift ise, takımları rastgele sırayla maçlara yerleştir
        if (teams.size() % 2 == 0) {

            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));

                // Burada aynı takımın kendisi ile maç yapmasını ve aynı maçın tekrarlanmasını engellemek için
                // takımların adlarını kullanarak bir kontrol yapılır.
                if (home != away && !fRounds.contains(home.getName() + " - " + away.getName()) && away.getId() != 0 && home.getId() != 0) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;
                }

            }
            // Eğer takım sayısı tek ise, "BAY" adında bir takım eklenir ve aynı mantıkla maçlar oluşturulur.
        } else {

            teams.add(new Team(0, "BAY"));

            while (counter < half) {
                Team home = teams.get(random.nextInt(teams.size()));
                Team away = teams.get(random.nextInt(teams.size()));

                if (home != away && !fRounds.contains(home.getName() + " - " +
                        away.getName()) && away.getId() != 0 && home.getId() != 0) {
                    fRounds.add(home.getName() + " - " + away.getName());
                    sRounds.add(away.getName() + " - " + home.getName());
                    counter++;
                }

            }
        }
        // Oluşturulan fikstürleri göstermek için "display" metodu çağrılır.
        display(fRounds);
        display(sRounds);

    }

    // Fikstürleri ekrana yazdıran metod
    public void display(List<String> rounds) {

        for (int i = 0; i < rounds.size(); i++) {
            if (i % 3 == 0) {
                System.out.println("\n " + sc + ". Round: ");
                sc++;
            }

            System.out.println(rounds.get(i));

        }
    }
}
