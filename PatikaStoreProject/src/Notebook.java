import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    int id = 1;
    int fiyat;
    int stok;
    String urunAdi;
    String marka;

    int hafiza;
    int ekranBoyutu;
    int ram;

    Scanner scan = new Scanner(System.in);






    public Notebook(int id,int fiyat,  String urunAdi, String marka, int hafiza, int ekranBoyutu, int ram) {
        this.fiyat = fiyat;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.ram = ram;
        this.id=id;
    }

    static ArrayList<Notebook> notebooks = new ArrayList<>();



    public Notebook() {

    }


    public  void urunEkle(){
        System.out.print("Ürün adı : ");
        this.urunAdi = scan.next();
        System.out.print("Ürün fiyati : ");
        scan.nextLine();
        this.fiyat = scan.nextInt();
        System.out.print("Marka : ");
        this.marka = scan.next();
        System.out.print("Depolama: ");
        this.hafiza = scan.nextInt();
        System.out.print("Ekran : ");
        this.ekranBoyutu = scan.nextInt();
        System.out.print("Ram : ");
        this.ram = scan.nextInt();


        notebooks.add(new Notebook(id,fiyat,urunAdi,marka,hafiza,ekranBoyutu,ram));
        id++;
    }

    public  void urunYazdir(){
        System.out.println("--------------------------------------------------------------------" +
                "--------------------------");
        System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S |\n","Ürün Adı",
                "Fiyat","Marka","Depolama","Ekran","Ram");

        System.out.println("-----------------------------------------------------------------------" +
                "-----------------------");
        for (Notebook notebook : notebooks){
            System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d |",
                    notebook.id,notebook.urunAdi,notebook.fiyat,notebook.marka,notebook.hafiza,
                    notebook.ekranBoyutu,notebook.ram);
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------" +
                "-----------------------");
    }



    public  void Notebookİslem(){
        System.out.println("Yapmak istediğiniz islemi seçiniz : ");
        System.out.println("1 - Ürün ekle : ");
        System.out.println("2 - ürün listele : ");
        System.out.println("3 - ürün filtrele : ");
        System.out.println("4 - ürün sil : ");
        System.out.println("5 - Store geri dön");
        int secim = scan.nextInt();
        NotebookSecimYap(secim);

    }

    public  void  NotebookSecimYap(int secim){
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
            Notebookİslem();
        }
    }

    public  void UrunFiltrele(){
        System.out.println("Filtreleme türünü seçiniz : ");
        System.out.println("1 - ID'ye göre filtrele");
        System.out.println("2 - Markaya göre filtrele");
        int secim = scan.nextInt();
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
        int idSecim = scan.nextInt();
        for (Notebook notebook : notebooks){
            if (notebook.id == idSecim){
                System.out.println("-------------------------------------------------------------------------" +
                        "---------------------");
                System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S |\n","Ürün Adı","Fiyat",
                        "Marka","Depolama","Ekran","Ram");
                System.out.println("---------------------------------------------------------------------------" +
                        "-------------------");
                System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d |",notebook.id,
                        notebook.urunAdi,notebook.fiyat,notebook.marka,
                        notebook.hafiza,notebook.ekranBoyutu,notebook.ram);
                System.out.println();
                System.out.println("----------------------------------------------------------------------" +
                        "------------------------");
            }
        }
    }

    public void MarkayaGöreFiltrele(){
        System.out.println("Markayı giriniz : ");
        String marka = scan.next();
        System.out.println("--------------------------------------------------------------------------" +
                "--------------------");
        System.out.printf("| ID | %-20s | %-10S | %-10S | %-10S | %-10S | %-10S |\n","Ürün Adı","Fiyat",
                "Marka","Depolama","Ekran","Ram");
        System.out.println("----------------------------------------------------------------------------" +
                "------------------");
        for (Notebook notebook : notebooks){
            if (notebook.marka.equals(marka)){
                System.out.format("| %-2d | %-20S | %-10d | %-10s | %-10d | %-10d | %-10d |",notebook.id,
                        notebook.urunAdi,notebook.fiyat,notebook.marka,
                        notebook.hafiza,notebook.ekranBoyutu,notebook.ram);
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------------------------------" +
                "-----------------");
    }

    public void UrunSil(){
        System.out.println("Silmek istediğiniz ürünün ID'sini giriniz : ");
        int id = scan.nextInt();
        notebooks.remove(id-1);
    }

}
