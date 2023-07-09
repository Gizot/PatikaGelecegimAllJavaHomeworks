package model;

import java.util.List;

public class Film {
    private String filmName;
    private String director;
    private Double imdbPoint;
    private List<Category> filmCategory;
    private List<Platform> filmPlatform;

    private List<MovieDuration> filmDuration;

    public Film(String filmName, String director,
                Double imdbPoint, List<Category> filmCategory,
                List<Platform> filmPlatform, List<MovieDuration> filmDuration) {
        this.filmName = filmName;
        this.director = director;
        this.imdbPoint = imdbPoint;
        this.filmCategory = filmCategory;
        this.filmPlatform = filmPlatform;
        this.filmDuration = filmDuration;

    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getImdbPoint() {
        return imdbPoint;
    }

    public void setImdbPoint(Double imdbPoint) {
        this.imdbPoint = imdbPoint;
    }

    public List<Category> getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(List<Category> filmCategory) {
        this.filmCategory = filmCategory;
    }

    public List<Platform> getFilmPlatform() {
        return filmPlatform;
    }

    public void setFilmPlatform(List<Platform> filmPlatform) {
        this.filmPlatform = filmPlatform;
    }

    public List<MovieDuration> getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(List<MovieDuration> filmDuration) {
        this.filmDuration = filmDuration;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", director='" + director + '\'' +
                ", imdbPoint=" + imdbPoint +
                ", filmCategory=" + filmCategory +
                ", filmPlatform=" + filmPlatform +
                ", filmDuration=" + filmDuration +
                '}';
    }
}
