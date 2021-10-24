package com.kalanco;

public class Main {

    public static void main(String[] args) {
	Point point = new Point();
    Square sq1 = new Square(point, 2);
    sq1.move(5, 5);
        System.out.println(sq1.getSurface());
    }
}
