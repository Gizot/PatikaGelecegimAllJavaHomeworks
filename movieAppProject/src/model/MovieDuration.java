package model;

public class MovieDuration {
    private String duration;

    public MovieDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MovieDuration{" +
                "duration='" + duration + '\'' +
                '}';
    }
}
