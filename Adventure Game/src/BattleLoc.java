import java.util.Random;

public abstract class BattleLoc extends  Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name,
                     Obstacle obstacle, String award,
                     int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }

    @Override
    public boolean onLocation() {
        System.out.println("Şuan buradasınız : " +this.getName());
        System.out.println("Dikkatli ol ! Burada " + this.getObstacle().getName() + "yaşıyor !" );
        return true;
    }
public int randomObstacleNumber(){
    Random r = new Random(); //Random sınıfına atanan değer bizim yazdığımız değerin 1 eksiği olabiliyor
    //O yüzden 0 da olmasını istemediğimiz için +1 ekledik.
    //Böylece 1,2,3 atayacak random olarak..
    return r.nextInt(3) + 1;
}
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
