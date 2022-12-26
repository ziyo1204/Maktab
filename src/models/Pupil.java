package models;

import java.util.Objects;

public class Pupil {
    //Pupil(id, user, exercise)
    int id;
    User user;
    Exercise exercise;
    public static int currentId=0;
    {
        currentId++;
    }

    public Pupil(int id, User user, Exercise exercise) {
        this.id = id;
        this.user = user;
        this.exercise = exercise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupil pupil = (Pupil) o;
        return id == pupil.id && Objects.equals(user, pupil.user) && Objects.equals(exercise, pupil.exercise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, exercise);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id=" + id +
                ", user=" + user +
                ", exercise=" + exercise +
                '}';
    }
}
