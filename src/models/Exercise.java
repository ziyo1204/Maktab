package models;

import java.util.Objects;

public class Exercise {
    //Exercise(id, title, subject, statusHW, grade)
    int id;
    String title;
    Subject subject;
    StatusHW statusHW;
    Grade grade;
    public static int currentId=0;
    {
        currentId++;
    }

    public Exercise(int id, String title, Subject subject, StatusHW statusHW, Grade grade) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.statusHW = statusHW;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public StatusHW getStatusHW() {
        return statusHW;
    }

    public void setStatusHW(StatusHW statusHW) {
        this.statusHW = statusHW;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return id == exercise.id && Objects.equals(title, exercise.title) && Objects.equals(subject, exercise.subject) && statusHW == exercise.statusHW && grade == exercise.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subject, statusHW, grade);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subject=" + subject +
                ", statusHW=" + statusHW +
                ", grade=" + grade +
                '}';
    }
}
