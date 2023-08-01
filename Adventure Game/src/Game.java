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
            System.out.println("1 - Güvenli Ev --> Burada güvendesiniz endişhe etmeyin..");
            System.out.println("2 - Mağaza --> Mağazadan silah ya da zırh satın alabilirsiniz !");
            System.out.println();
            System.out.println("*************************************");
            System.out.println();
            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default: // secim yapılmazsa default olarak SafeHouse'da bulunsun.
                    location = new SafeHouse(player);



            }
            if(!location.onLocation()){
                System.out.println("GAME OVER");
                break;

            };

        }



    }
}
