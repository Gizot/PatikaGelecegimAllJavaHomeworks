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
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " +this.getName());
        System.out.println("Dikkatli ol ! Burada " + obsNumber + " tane " +
                this.getObstacle().getName() + " yaşıyor !" );
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            if(combat(obsNumber)) {
                System.out.println(this.getName() + "tüm düşmanları yendiniz !" );
                return  true;
            }
        }
        if(this.getPlayer().getHealth() <= 0 ) {
            System.out.println("Canınız tükendi ---- ÖLDÜNÜZZ :( !");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
       // int defaultObstacleHealth = this.getObstacle().getHealth(); diyebiliriz
        //ya da Obstacle sınıfına gidip private int defaultHealth tanımlayabiliriz.
        //ki öyle yapacağız..

        for(int i = 1; i <= obsNumber ; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() >0 ){
                System.out.println("<V>ur veya <K>aç");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    System.out.println(this.getPlayer().getName() +" tarafından saldırı yapıldı.");
                    this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0 ) {
                        System.out.println();
                        System.out.println(this.getObstacle().getName() + " size saldırıda bulundu !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }

                } else{
                    return false;
                }

            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Düşmanı yendiniz!!");
                System.out.println(this.getObstacle().getAward() + " Para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());

            }

        }

        return false;
    }

    public  void afterHit (){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("--------------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah  : " + this.getPlayer().getWeapon().getName());
        System.out.println("Hasar  : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh   : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para   : " + this.getPlayer().getMoney());
        if(this.getPlayer().getInventory().getWeapon().getDamage() > 0){
            System.out.println("");

        }
    }

    public void obstacleStats(int i) {
        System.out.println(i + "." +this.getObstacle().getName() + " Değerleri");
        System.out.println("--------------------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Para : " + this.getObstacle().getAward());
    }
public int randomObstacleNumber(){
    Random r = new Random(); //Random sınıfına atanan değer bizim yazdığımız değerin 1 eksiği olabiliyor
    //O yüzden 0 da olmasını istemediğimiz için +1 ekledik.
    //Böylece 1,2,3 atayacak random olarak..
    return r.nextInt(this.getMaxObstacle()) + 1;
}

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
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
