package com.boot.myapp.Entity;

public class Book {

    private int id;
    private String Name;
    private String Dec;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Book(int id, String name, String dec) {
        this.id = id;
        Name = name;
        Dec = dec;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDec(String dec) {
        Dec = dec;
    }

    public Book() {
    }

    public String getDec() {
        return Dec;
    }

}
