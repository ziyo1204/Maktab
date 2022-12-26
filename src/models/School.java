package models;

import java.util.Objects;

public class School {
    //School(id, name, address, Status)
    private static int id;
    private static String name;
    private static String address;
    private static Status status;
    public static int currentId=0;
    {
        currentId++;
    }

    public School(int id, String name, String address, Status status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static int getCurrentId() {
        return currentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return id == school.id && Objects.equals(name, school.name) && Objects.equals(address, school.address) && status == school.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, status);
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
