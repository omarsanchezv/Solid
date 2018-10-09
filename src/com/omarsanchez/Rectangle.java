package com.omarsanchez;

public class Rectangle {
    private int base;
    private int hight;

    public Rectangle(int base, int hight) {
        this.base = base;
        this.hight = hight;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public double getArea() {
        return base * hight;
    }

    public double getPerimeter() {
        return (base + hight) * 2;
    }
}
