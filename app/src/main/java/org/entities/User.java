package org.entities;

public class User {
    private int id;
    private String name;
    private String hashPass;

    public User() {}

    public User(int id, String name, String hashPass) {
        this.id = id;
        this.name = name;
        this.hashPass = hashPass;
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

    public String getHashPass() {
        return hashPass;
    }

    public void setHashPass(String hashPass) {
        this.hashPass = hashPass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hashPass='" + hashPass + '\'' +
                '}';
    }
}
