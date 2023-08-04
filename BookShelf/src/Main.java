import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("Dune - 1", 688, "Frank Herbert","2021");
        Book b2 = new Book("Dune - 2", 654, "Frank Herbert","2021");
        Book b3 = new Book("Dune - 3", 612, "Frank Herbert","2021");
        Book b4 = new Book("Dune - 4", 514, "Frank Herbert","2021");
        Book b5 = new Book("Dune - 5", 448, "Frank Herbert","2021");

        System.out.println("\n********** List ordered by title of the book **********");
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(b5);
        bookSetByName.add(b4);
        bookSetByName.add(b3);
        bookSetByName.add(b2);
        bookSetByName.add(b1);

        for (Book book : bookSetByName){
            System.out.println(book);
        }

        System.out.println("\n----------- List ordered by the number of pages of the book ------------");
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });

        bookSetByPageCount.add(b5);
        bookSetByPageCount.add(b4);
        bookSetByPageCount.add(b3);
        bookSetByPageCount.add(b2);
        bookSetByPageCount.add(b1);

        for (Book book : bookSetByPageCount){
            System.out.println(book);
        }
    }

}