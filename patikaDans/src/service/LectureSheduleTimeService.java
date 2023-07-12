package service;

import model.Day;
import model.LectureScheduleTime;

public class LectureSheduleTimeService {

    public LectureScheduleTime createLectureScheduleTime(Day dayOfWeek, String time){
        LectureScheduleTime lectureScheduleTime = new LectureScheduleTime();
        lectureScheduleTime.setDay(dayOfWeek);
        lectureScheduleTime.setTime(time);
        return lectureScheduleTime;
    }
}
