public class Armor {
    private int id;
    private String name;
    private  int block;
    private int price;

    public Armor(int id,String name, int block, int price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }
    public static Armor[] armors() {
        Armor[] armorList = new Armor[4];
        armorList[0] = new Armor(1,"Hafif   ", 1, 10);
        armorList[1] = new Armor(2,"Orta    ", 3, 15);
        armorList[2] = new Armor(3,"Sağlam  ", 5, 25);
        armorList[3] = new Armor(4,"Ağır    ", 7, 40);
        return  armorList;

    }

    public  static  Armor getArmorObjByID(int id) {
        for (Armor a : Armor.armors()) {
            if(a.getId() == id) {
                return a;
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

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
