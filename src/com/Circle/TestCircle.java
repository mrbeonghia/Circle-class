package com.Circle;

public class TestCircle {

    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        double result = c.getRadius();
        System.out.println(result);
    }
}

class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}