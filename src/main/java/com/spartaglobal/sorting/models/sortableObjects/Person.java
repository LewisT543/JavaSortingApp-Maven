package com.spartaglobal.sorting.models.sortableObjects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int height;

    public Person(int id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ",name=" + name +
                ",height=" + height +
                '}';
    }
}
