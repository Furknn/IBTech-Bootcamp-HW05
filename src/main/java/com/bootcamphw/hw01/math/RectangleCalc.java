package com.bootcamphw.hw01.math;


public class RectangleCalc {
    private double height;
    private double width;

    public RectangleCalc(double height, double width) {
        this.height = height;
        this.width = width;
        
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}

