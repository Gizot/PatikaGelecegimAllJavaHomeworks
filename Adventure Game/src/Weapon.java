public class Weapon {
    private int id;
    private String name;
    private int damage;
    private int price;



    public Weapon(int id,String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }
    public static Weapon[] weapons() {
        Weapon[] weponList = new Weapon[4];
        weponList[0] = new Weapon(1,"Tabanca  ", 2,5);
        weponList[1] = new Weapon(2,"Kılıç    ", 3, 10);
        weponList[2] = new Weapon(3,"Ok ve Yay",5,12);
        weponList[3] = new Weapon(4,"Tüfek    ", 7, 15);
        return  weponList;
    }
    public static Weapon getWeaponObjByID(int id){

        for(Weapon w : Weapon.weapons()) {
            if(w.getId() == id){
                return w;
            }
        }
        return null;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
