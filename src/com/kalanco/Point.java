package com.kalanco;

import java.awt.*;

public class Point extends Figure{
    public double x;
    public double y;
    public Color color;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
    public double distanceTo(Point point){
        return Math.sqrt((this.x - point.x) * (this.x - point.x) +
                (this.y - point.y) * (this.y - point.y));
    }
    public double distanceXTo(Point point){
        return Math.abs(this.x - point.x);
    }
    public double distanceYTo(Point point){
        return Math.abs(this.y - point.y);
    }
}
