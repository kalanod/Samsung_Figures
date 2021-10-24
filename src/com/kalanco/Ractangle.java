package com.kalanco;

import java.awt.*;

public class Ractangle {
    public Point v;
    public double edgeX;
    public double edgeY;
    public Color color;

    public Ractangle(Point v, double edgeX, double edgeY) {
        this.v = v;
        this.edgeX = edgeX;
        this.edgeY = edgeY;
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "v=" + v +
                ", edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                '}';
    }
    public void move(double dx, double dy){
        this.v.x += dx;
        this.v.y += dy;
        this.edgeX += dx;
        this.edgeY += dy;
    }
    public void setColor(Color c){
        this.color = c;
    }
    public double getSurface(){
        return (Math.abs(this.v.x - this.edgeX)
                * Math.abs(this.v.y - this.edgeY));
    }
    public double getPerimeter(){
        return (Math.abs(this.v.x - this.edgeX) * 2 +
                Math.abs(this.v.y - this.edgeY) * 2);
    }
}
