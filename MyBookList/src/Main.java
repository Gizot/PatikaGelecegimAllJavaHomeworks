import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1,"Dune", "Frank Herbert","İthaki", 588, 2021));
        bookList.add(new Book(2,"Kaos", "James Gleick","Alfa", 386, 2014));
        bookList.add(new Book(3,"Haşhaşiler", "Bernard Lewis","Kapı", 232,
                2014));
        bookList.add(new Book(4,"İslam", "Bernard Lewis", "Akılçelen", 313,
                2020));
        bookList.add(new Book(5,"Küçük Prens", "Antoine de Saint- Exupery", "Can", 105,
                2015));
        bookList.add(new Book(6,"Epiktetos", "Kendisinin Efendisi Olmayan Hiçkimse Özgür Değildir",
                "Destek", 86,2019));
        bookList.add(new Book(7,"Dışa Dönen Rüya Görür, İçe Bakan Uyanır", "Carl Gustav Jung",
                "Destek", 128, 2020));
        bookList.add(new Book(8,"Antikçağ Gizem Kültleri", "Walter Burkert", "Alfa",192,
                2012));
        bookList.add(new Book(9,"Varoluşun Halleri", "Kaan H. Ökten", "Alfa", 333,
                2022));
        bookList.add(new Book(10,"Ezoterizme Giriş", "Ergun Candan", "Sınır Ötesi", 380,
                2022));

        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));

        for(String i : bookMap.keySet()) {
            System.out.println(i + " - "+ bookMap.get(i));
        }
        System.out.println("\n");

        //Filter												//get pageNo > 300 !
        List<Book> filterBook = bookList.stream().filter(book -> book.getPageNo() > 100).collect(Collectors.toList());
        System.out.println("---------- Sayfa sayısı 300'den Büyük olan kitaplar ------");
        filterBook.stream().forEach(b -> System.out.println(

                "Book Name : "+ b.getName()+ " "+
                        "Page Number : "+b.getPageNo()+ " "+
                        "Author : "+b.getAuthorName()+ " "+
                        "Year : "+b.getPublishYear()));
        System.out.println("------------------------------------------------------------------");


        //
        long count = filterBook.stream().count();
        System.out.println("Number of books : "+ count);


    }


}