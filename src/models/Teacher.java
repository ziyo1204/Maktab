package models;

import java.util.Objects;

public class Teacher {
    //Teacher(id, user, class, school)
    int id;
    User teacher;
    Class classs;
    School school;
    public static int currentId=0;
    {
        currentId++;
    }

    public Teacher(int id, User teacher, Class classs, School school) {
        this.id = id;
        this.teacher = teacher;
        this.classs = classs;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public Class getClasss() {
        return classs;
    }

    public void setClasss(Class classs) {
        this.classs = classs;
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
        Teacher teacher1 = (Teacher) o;
        return id == teacher1.id && Objects.equals(teacher, teacher1.teacher) && Objects.equals(classs, teacher1.classs) && Objects.equals(school, teacher1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacher, classs, school);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", classs=" + classs +
                ", school=" + school +
                '}';
    }
}
