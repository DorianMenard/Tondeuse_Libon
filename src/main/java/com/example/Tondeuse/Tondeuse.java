package com.example.Tondeuse;

import java.util.List;

public class Tondeuse {
    private String id;
    private int x;
    private int y;
    private char orientation;
    private Pelouse Pelouse;
    private List<Character> actions;

    public Tondeuse(String id, int x, int y, char orientation, com.example.Tondeuse.Pelouse pelouse, List<Character> actions) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.Pelouse = pelouse;
        this.actions = actions;
    }

    public void turnLeft() {
        switch (orientation) {
            case 'N': orientation = 'W'; break;
            case 'E': orientation = 'N'; break;
            case 'S': orientation = 'E'; break;
            case 'W': orientation = 'S'; break;
        }
    }

    public void turnRight() {
        switch (orientation) {
            case 'N': orientation = 'E'; break;
            case 'E': orientation = 'S'; break;
            case 'S': orientation = 'W'; break;
            case 'W': orientation = 'N'; break;
        }
    }
    //todo : moveForward()
    public void moveForward() {
        int newX = x;
        int newY = y;

        switch (orientation) {
            case 'N': newY++; break;
            case 'E': newX++; break;
            case 'S': newY++; break;
            case 'W': newY++; break;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Character> getActions() {
        return actions;
    }

    public void setActions(List<Character> actions) {
        this.actions = actions;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public com.example.Tondeuse.Pelouse getPelouse() {
        return Pelouse;
    }

    public void setPelouse(com.example.Tondeuse.Pelouse pelouse) {
        Pelouse = pelouse;
    }
}
