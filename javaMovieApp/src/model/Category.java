package model;

public class Category {

    private String categoryName;
    private int filmCount;

    public Category(String name){
        this.categoryName = name;
        this.filmCount = 0;
    }
    public int getFilmCount() {
        return filmCount;
    }

    public void setFilmCount() {
        this.filmCount++;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}