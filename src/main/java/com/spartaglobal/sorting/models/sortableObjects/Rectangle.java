package com.spartaglobal.sorting.models.sortableObjects;

public class Rectangle implements Comparable<Rectangle>{
    private int width;
    private int height;
    private int area;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    // This method allows us to pass this to a generic type sorter.
    public int compareTo(Rectangle o) {
        int difference = this.getArea() - o.getArea();
        if (difference == 0) {
            return this.getHeight() - o.getHeight();
        }
        return difference;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "w=" + width +
                ",h=" + height +
                ",AREA=" + area +
                '}';
    }
}
