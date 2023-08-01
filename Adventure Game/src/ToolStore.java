public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.println("Seçiminiz : ");
            int selectCase = input.nextInt();//Location.input.nextInt(); şeklinde de tanımlayabilirdik
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz bir değer girdiniz, lütfen geçerli bir değer giriniz : ");
                selectCase = input.nextInt(); // aynı şekilde bunu da Location.input.nextInt(); şeklinde tanımlayabilirdik.
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Her zaman bekleriz.");
                    showMenu = false;
                    break;
            }
        }
        return true; //true döndürdük çünkü normal locationlarda ölme ihtimalim yok
    }

    public void printWeapon() {
        System.out.println("*********Silahlar*********");
        System.out.println(" ");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println("ID : " + weapon.getId() +
                    " | " + weapon.getName() + "-->" +
                    "\t | Para : " + weapon.getPrice() +
                    "\t | Hasar : " + weapon.getDamage());
        }
        System.out.println("0 - Çıkış yap");
    }


    public void buyWeapon() {
        System.out.println("Bir silah seçiniz : ");

        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 && selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                } else {
                    //Satın alma burada gerçekleşiyor.
                    System.out.println(selectedWeapon.getName() + "Silah satın alma başarılı..");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    // System.out.println("Önceki silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    // this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    // System.out.println("Yeni silahınız : " + this.getPlayer().getInventory().getWeapon().getName());


                }

            }

        }
    }

    public void printArmor() {
        System.out.println("*****************Zırhlar*****************");
        for (Armor a : Armor.armors()) { //Armor veritipinde a  nesnesi oluşturalım
            // Bu a nesnesi Armor sınıfının armors metodunu geri döndürsün.
            System.out.println(a.getId() +
                    " | " + a.getName() +
                    " | " + "Zırh  : " + a.getBlock() +
                    " | " + "Para : " + a.getPrice());

        }

    }

    public void buyArmor() {
        System.out.println("Bir zırh seçiniz : ");

        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız !");

                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Kalan bakiyeniz : " + this.getPlayer().getMoney());
                }
            }
        }
    }
}




