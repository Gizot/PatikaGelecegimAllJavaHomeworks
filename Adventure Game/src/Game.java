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


    }
}
