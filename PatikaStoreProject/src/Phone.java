import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    int id =1;

    int fiyat;
    int stok;
    String urunAdi;
    String marka;

    int hafiza;
    int ekranBoyutu;
    int pilGucu;
    int ram;
    String renk;



    public Phone(int id,int fiyat,  String urunAdi, String marka,
                 int hafiza, int ekranBoyutu, int pilGucu, int ram, String renk) {
        this.fiyat = fiyat;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
        this.id = id;
    }

    ArrayList<Phone> phones = new ArrayList<>();




    static Scanner scan1 = new Scanner(System.in);

    public Phone() {

    }


    public  void urunEkle(){
        System.out.print("Ürün adı : ");
        this.urunAdi = scan1.next();
        System.out.print("Ürün fiyati : ");
        scan1.nextLine();
        this.fiyat = scan1.nextInt();
        System.out.print("Marka : ");
        this.marka = scan1.next();
        System.out.print("Depolama: ");
        this.hafiza = scan1.nextInt();
        System.out.print("Ekran : ");
        this.ekranBoyutu = scan1.nextInt();
        System.out.print("Ram : ");
        this.ram = scan1.nextInt();
        System.out.print("Pil : ");
        this.pilGucu = scan1.nextInt();
        System.out.print("Renk : ");
        this.renk = scan1.next();

        phones.add(new Phone(id,fiyat,urunAdi,marka,hafiza,ekranBoyutu,pilGucu,ram,renk));
        id ++;
    }

    public  void urunYazdir(){
        System.out.println("------------------------------------------------------------" +
                "-----------------------------------------------------------");
        System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S |" +
                "\n","Ürün Adı","Fiyat","Marka","Depolama","Ekran","Pil","Ram","Renk");
        System.out.println("---------------------------------------------------------------" +
                "--------------------------------------------------------");
        for (Phone phone : phones){
            System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d | %-10d | %-10S |"
                    ,phone.id,phone.urunAdi,phone.fiyat,phone.marka,phone.hafiza,phone.ekranBoyutu,
                    phone.pilGucu,phone.ram,phone.renk);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------" +
                "----------------------------------------------");
    }



    public  void Phoneİslem(){
        System.out.println("Yapmak istediğiniz islemi seçiniz : ");
        System.out.println("1 - Ürün ekle : ");
        System.out.println("2 - ürün listele : ");
        System.out.println("3 - ürün filtrele : ");
        System.out.println("4 - ürün sil : ");
        System.out.println("5 - Store geri dön");
        int secim = scan1.nextInt();
        SecimYap(secim);

    }

    public  void  SecimYap(int secim){
        switch (secim){
            case 1:
                urunEkle();
                break;
            case 2:
                urunYazdir();
                break;
            case 3:
                UrunFiltrele();
                break;
            case 4:
                UrunSil();
                break;
        }
        if (secim != 5){
            Phoneİslem();
        }
    }

    public  void UrunFiltrele(){
        System.out.println("Filtreleme türünü seçiniz : ");
        System.out.println("1 - ID'ye göre filtrele");
        System.out.println("2 - Markaya göre filtrele");
        int secim = scan1.nextInt();
        switch (secim){
            case 1:
                IDfiltrele();
                break;
            case 2:
                MarkayaGöreFiltrele();
                break;

        }
    }

    public  void IDfiltrele(){
        System.out.println("ID yi giriniz : ");
        int idSecim = scan1.nextInt();
        for (Phone phone : phones){
            if (phone.id == idSecim){
                System.out.println("------------------------------------------------------------------------" +
                        "-----------------------------------------------");
                System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S |\n",
                        "Ürün Adı","Fiyat","Marka","Depolama","Ekran","Pil","Ram","Renk");
                System.out.println("--------------------------------------------------------------------------" +
                        "---------------------------------------------");
                System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d | %-10d | %-10S |",
                        phone.id,phone.urunAdi,phone.fiyat,phone.marka,phone.hafiza,phone.ekranBoyutu,
                        phone.pilGucu,phone.ram,phone.renk);
                System.out.println();
                System.out.println("---------------------------------------------------------------------------" +
                        "--------------------------------------------");
            }
        }
    }

    public void MarkayaGöreFiltrele(){
        System.out.println("Markayı giriniz : ");
        String marka = scan1.next();
        System.out.println("-----------------------------------------------------------------------------------" +
                "------------------------------------");
        System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S | %-10S |\n","Ürün Adı",
                "Fiyat","Marka","Depolama","Ekran","Pil","Ram","Renk");
        System.out.println("-----------------------------------------------------------------------------------" +
                "------------------------------------");
        for (Phone phone : phones){
            if (phone.marka.equals(marka)){
                System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d | %-10d | %-10S |",
                        phone.id,phone.urunAdi,phone.fiyat,phone.marka,phone.hafiza,phone.ekranBoyutu,
                        phone.pilGucu,phone.ram,phone.renk);
                System.out.println();
            }
        }
        System.out.println("--------------------------------------------------------------------------" +
                "---------------------------------------------");
    }

    public void UrunSil(){
        System.out.println("Silmek istediğiniz ürünün ID'sini giriniz : ");
        int id = scan1.nextInt();
        phones.remove(id-1);
    }
}
