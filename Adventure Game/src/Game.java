import java.util.Scanner;

public class Game {
    public void start() {
        Scanner input  = new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.println("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Macerasever " + player.getName() + " adrenalin dolu Pan Galaktik Macera Serüvenine hoşgeldin !"
        +"\n Burada hayatta kalabilmek için zeki çevik ve kurnaz olmak zorundasın !"
        +"\n Harkonnenler ve Vogonlar vahşi ve acımasızdır!!"
                +"\n Fremenleri bul, tabi onlar kendilerini bulmanı isterse...");
        System.out.println("Lütfen bir karakter seçiniz : ");
        player.selectChar();

        while (true) {
            player.printPlayerInfo();
            Location location = null;
            System.out.println();
            System.out.println("***********Bölgeler****************");
            System.out.println();
            System.out.println("1 - Güvenli Ev -->  Güvende olmak istiyorsan buraya gidebilirsin..");
            System.out.println("2 - Mağaza --> Mağazadan silah ya da zırh satın alabilirsiniz !");
            System.out.println("3 - Mağara --> Mağaraya gir, dikkatli ol harkonnen çıkabilir !");
            System.out.println("0 - Çıkış yap --> Oyunu sonlandır. ");
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;

                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                default: // secim yapılmazsa default olarak SafeHouse'da bulunsun.
                    location = new SafeHouse(player);



            }
            if(location == null){
                System.out.println("Bu macera gözünü korkutmuş olmalı, çabuk pes ettin..");
                break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER");
                break;

            };

        }



    }
}
