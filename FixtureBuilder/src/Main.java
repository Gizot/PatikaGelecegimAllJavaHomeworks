import java.util.ArrayList;
import java.util.List;

public class Main {
    // Main sınıfı, Fixture sınıfını kullanarak bir takım listesi oluşturur ve fikstürü oluşturur.
    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();
        teams.add(new Team(1,"Beşiktaş"));
        teams.add(new Team(2,"Galatasaray"));
        teams.add(new Team(3,"Başakşehir"));
        teams.add(new Team(4,"Fenerbahçe"));
        teams.add(new Team(5,"Trabzon"));
        teams.add(new Team(6,"Bursa"));
        teams.add(new Team(7,"Bolu"));
        Fixture again = new Fixture(teams);
        again.generate();
    }
}