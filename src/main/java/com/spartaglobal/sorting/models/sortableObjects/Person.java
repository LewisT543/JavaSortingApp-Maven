package com.spartaglobal.sorting.models.sortableObjects;

import java.nio.charset.StandardCharsets;

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
// UPDATE: I need a... Minimum Perfect Hash function with Order preserving... I don't know how to write this.
//    @Override
//    public int hashCode() {
//        // This could be more robust - may go a bit wrong when we deal with 3 character ascii values (lower case).
//        // Must return an int so we have a new problem
//        StringBuilder myBuilder = new StringBuilder();
//        byte[] bytes = this.name.getBytes(StandardCharsets.US_ASCII);
//        for (byte charValue : bytes) {
//            myBuilder.append(charValue);
//        }
//        return Integer.MAX_VALUE - Integer.parseInt(myBuilder.toString());
//    }
//
//    @Override
//    public int hashCode() {
//        // This could be more robust - may go a bit wrong when we deal with 3 character ascii values (lower case).
//        // Must return an int so we have a new problem
//
//        /* A Quote... not exactly helping but I realise this is important now.
//        Do not be tempted to exclude significant parts of an object from the hash code computation to
//        improve performance -- Joshua Bloch, Effective Java
//         */
//        StringBuilder myBuilder = new StringBuilder();
//        byte[] bytes = this.name.getBytes(StandardCharsets.US_ASCII);
//        for (int i = 0; i < 3; i++) {
//            myBuilder.append(bytes[i]);
//        }
//        return Integer.MAX_VALUE - Integer.parseInt(myBuilder.toString());
//    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ",name=" + name +
                ",height=" + height +
                '}';
    }
}
