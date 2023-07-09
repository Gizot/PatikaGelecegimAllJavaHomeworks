package model;

public class Category {
    private  String categoryName;
    private  String filmCount;

    public Category(String categoryName, String filmCount) {
        this.categoryName = categoryName;
        this.filmCount = filmCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getFilmCount() {
        return filmCount;
    }

    public void setFilmCount(String filmCount) {
        this.filmCount = filmCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", filmCount='" + filmCount + '\'' +
                '}';
    }
}
