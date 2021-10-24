package com.kalanco;

import java.awt.*;

public class Circle {
    public Point center;
    public double radius;
    public Color color;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
    public void move(double dx, double dy){
        this.center.x += dx;
        this.center.y += dy;
    }
    public void setColor(Color c){
        this.color = c;
    }
    public double getSurface(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public double getDiameter(){
        return 2 * this.radius;
    }
}
