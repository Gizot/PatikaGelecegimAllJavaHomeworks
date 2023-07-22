import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;

    //Random utilden ilk başlangıçta kullanıcılara  %50 (eşit) başlama olasılığı verebilmek için çağırıldı
    Random random;
    int minWeight;
    int maxWeight;



    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.random = new Random();
    }

    public void run(){
        //olasılığı gerçekleştirebilsin diye run metodunun başlangıcında rastgele bir
        // sayı üretin ve buna göre hangi savaşçının kaç olasılıkla başlayabileceğini
        //  0.50 olasılık oranı vererek belirledik ve
        //her iki savaşçı için süreci aynı şekilde yönettik.
        boolean isFirstFighterStarts = random.nextFloat()<0.5;
        if (isFirstFighterStarts) {
            while(this.f1.health > 0 && this.f2.health >0) {
                if(isCheck()){
                    while(this.f1.health > 0 && this.f2.health > 0 ){
                        System.out.println("=====NEW ROUND=====");
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                        System.out.println(f2.health);

                        this.f1.health = this.f2.hit(this.f1);
                        if(isWin()){
                            break;
                        }
                        System.out.println(this.f1.name + "Sağlık : " + this.f1.health);
                        System.out.println(this.f2.name + "Sağlık : " + this.f2.health);

                    }

                } else {
                    System.out.println("Sporcuların sikletleri uymuyor!");
                }
                if( this.f2.health >= this.f1.health) {
                    System.out.println(this.f2.name + " WIN!");
                } else {
                    System.out.println(this.f1.name + " WIN!");
                }

            }
        }else {
            while (this.f1.health > 0 && this.f2.health >0) {
                if(isCheck()){
                    while(this.f1.health > 0 && this.f2.health > 0 ){
                        System.out.println("=====NEW ROUND=====");
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                        System.out.println(f2.health);

                        this.f1.health = this.f2.hit(this.f1);
                        if(isWin()){
                            break;
                        }
                        System.out.println(this.f1.name + "Sağlık : " + this.f1.health);
                        System.out.println(this.f2.name + "Sağlık : " + this.f2.health);

                    }

                } else {
                    System.out.println("Sporcuların sikletleri uymuyor!");
                }
                if( this.f2.health >= this.f1.health) {
                    System.out.println(this.f2.name + " WIN!");
                } else {
                    System.out.println(this.f1.name + " WIN!");
                }
            }
        }

    }
    boolean isCheck(){
        return  ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){
        if(this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if(this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }


}
