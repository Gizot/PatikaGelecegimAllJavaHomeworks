import java.util.Scanner;

public class Store {

    Scanner scan = new Scanner(System.in);
    Brand brand = new Brand();
    Phone phone = new Phone();

    Notebook notebook = new Notebook();


    public  void start(){
        System.out.println();
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");
        System.out.print("Tercihiniz : ");
        int secim = scan.nextInt();
        SecimYap(secim);

    }

    public  void  SecimYap(int secim){
        switch (secim){
            case 1:
                notebook.Notebookİslem();
                break;
            case 2:
                phone.Phoneİslem();
                break;
            case 3:
                brand.BrandYazdır();
                break;
        }
        if(secim != 0){
            start();
        }
    }


}
