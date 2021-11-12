package com.kalanco;

import java.awt.*;

public class Square extends Rectangle{
    public Square(Point v, double edge) {
        super(v, edge, edge);
    }

    @Override
    public String toString() {
        return "Square{" +
                "v=" + v +
                ", edge=" + edgeX +
                '}';
    }

}
