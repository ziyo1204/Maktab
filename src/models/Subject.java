package models;

import java.util.Objects;

public class Subject {
    //Subject(id, name, teacher, School)
    private static int id;
    private static String name;
    private static User teacher;
    private static School school;
    public static int currentId=0;
    {
        currentId++;
    }

    public Subject(int id, String name, User teacher, School school) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.school = school;
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

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id && Objects.equals(name, subject.name) && Objects.equals(teacher, subject.teacher) && Objects.equals(school, subject.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teacher, school);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", school=" + school +
                '}';
    }
}
