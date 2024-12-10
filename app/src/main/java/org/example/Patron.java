package org.example;
public class Patron {
    private String name;
    private String id;

    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patron [Name=" + name + ", ID=" + id + "]";
    }
}
