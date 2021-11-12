package com.kalanco;

import java.awt.*;

public class Triangle extends Figure{
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
    public double getSurface(){
        double p = (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1)) / 2;
        return Math.sqrt(p * (p - v1.distanceTo(v2)) * (p - v2.distanceTo(v3)) * (p - v3.distanceTo(v1)));
    }
    public double getPerimeter(){
        return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
    }
    public boolean isIsoceles(){
        return (v1.distanceTo(v2) == v1.distanceTo(v3)) ||
                (v2.distanceTo(v3) == v2.distanceTo(v1)) ||
                (v3.distanceTo(v1) == v3.distanceTo(v2));
    }
    public boolean estEquilateral(){
        return v1.distanceTo(v2) == v2.distanceTo(v3) &&
                v1.distanceTo(v2) == v1.distanceTo(v3);
    }
    public boolean isRectangle(){
        double ab = v1.distanceTo(v2);
        double bc = v1.distanceTo(v3);
        double ca = v2.distanceTo(v3);
        if (ab > bc && ab > ca){
            return bc * bc + ca * ca == ab * ab;
        }
        if (bc > ab && bc > ca){
            return ab * ab + ca * ca == bc * bc;
        }
        return bc * bc + ab * ab == ca * ca;
    }
}
