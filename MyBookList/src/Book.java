public class Book {
    private int id;

    private String name;
    private String authorName;
    private String publisher;
    private int pageNo;
    private int publishYear;

    public Book(int id, String name, String authorName, String publisher, int pageNo, int publishYear) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.publisher = publisher;
        this.pageNo = pageNo;
        this.publishYear = publishYear;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
