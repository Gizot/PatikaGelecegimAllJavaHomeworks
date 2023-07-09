package model;

public class DurationTime {
    private String hour;

    public DurationTime(String showTime) {
        this.hour = showTime;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "DurationTime{" +
                "hour='" + hour + '\'' +
                '}';
    }
}
