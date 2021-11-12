package com.kalanco;

import java.awt.*;

abstract class Figure {
    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void move(double dx, double dy);
}
