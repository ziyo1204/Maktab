package models;

import java.util.Objects;

public class Class {
    //Class(id, name, Subject,User(pupil))
    private static int id;
    private static String name;
    private static Subject subject;
    private static User pupil;
    public static int currentId=0;
    {
        currentId++;
    }

    public Class(int id, String name, Subject subject, User pupil) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.pupil = pupil;
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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public User getPupil() {
        return pupil;
    }

    public void setPupil(User pupil) {
        this.pupil = pupil;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return id == aClass.id && Objects.equals(name, aClass.name) && Objects.equals(subject, aClass.subject) && Objects.equals(pupil, aClass.pupil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subject, pupil);
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", pupil=" + pupil +
                '}';
    }
}
