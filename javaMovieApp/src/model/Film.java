package model;

import java.util.ArrayList;
import java.util.List;
public class Film {
    private String filmName;
    private ArrayList<Category> categoryList = new ArrayList<>();
    private ArrayList<Platform> platformList = new ArrayList<>();

    public Film(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }


    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public ArrayList<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(ArrayList<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", categoryList=" + categoryList +
                ", platformList=" + platformList +
                '}';
    }
}
