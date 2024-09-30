package com.example.Tondeuse;

public class Tondeuse {
    private int x;
    private int y;
    private char orientation;
    private Pelouse Pelouse;

    public Tondeuse(int x, int y, char orientation, com.example.Tondeuse.Pelouse pelouse) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        Pelouse = pelouse;
    }

    //todo : turnLeft()
    //todo : turnRight()
    //todo : moveForward()

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getOrientation() {
        return orientation;
    }
}
