package com.example.Tondeuse;

import java.util.List;

public class TondeuseRequest {
    private int pelouseMaxX;
    private int pelouseMaxY;
    private List<Tondeuse> tondeuses;

    public int getPelouseMaxX() {
        return pelouseMaxX;
    }

    public void setPelouseMaxX(int pelouseMaxX) {
        this.pelouseMaxX = pelouseMaxX;
    }

    public int getPelouseMaxY() {
        return pelouseMaxY;
    }

    public void setPelouseMaxY(int pelouseMaxY) {
        this.pelouseMaxY = pelouseMaxY;
    }

    public List<Tondeuse> getTondeuses() {
        return tondeuses;
    }

    public void setTondeuses(List<Tondeuse> tondeuses) {
        this.tondeuses = tondeuses;
    }
}
