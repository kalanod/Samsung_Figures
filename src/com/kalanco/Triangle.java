package com.kalanco;

import java.awt.*;

public class Triangle {
    public Point v1, v2, v3;
    public Color color;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
    public void move(double dx, double dy){
        this.v1.x += dx;
        this.v1.y += dy;

        this.v2.x += dx;
        this.v2.y += dy;

        this.v3.x += dx;
        this.v3.y += dy;
    }
    public void setColor(Color c){
        this.color = c;
    }
    public double getSurface(){
        double p = (Math.sqrt(v1.x - v2.x) * (v1.x - v2.x) + (v1.y - v2.y) * (v1.y - v2.y) +
                Math.sqrt(v2.x - v3.x) * (v2.x - v3.x) + (v2.y - v3.y) * (v2.y - v3.y) +
                Math.sqrt(v3.x - v1.x) * (v3.x - v1.x) + (v3.y - v1.y) * (v3.y - v1.y)) / 2;
        return Math.sqrt(p *
                (p - Math.sqrt(v1.x - v2.x) * (v1.x - v2.x) + (v1.y - v2.y) * (v1.y - v2.y)) *
                (p - Math.sqrt(v2.x - v3.x) * (v2.x - v3.x) + (v2.y - v3.y) * (v2.y - v3.y)) *
                (p - Math.sqrt(v3.x - v1.x) * (v3.x - v1.x) + (v3.y - v1.y) * (v3.y - v1.y)));
    }
    public double getPerimeter(){
        return Math.abs(v1.x - v2.x) + Math.abs(v2.x - v3.x) + Math.abs(v3.y - v1.y);
    }
}
