package com.example.Tondeuse;

import java.util.ArrayList;
import java.util.List;

public class TondeuseResponse {
    private List<String> results = new ArrayList<>();

    public void addTondeuseResult(Tondeuse tondeuse) {
        String result = String.format("x: %d , y: %d / %s", tondeuse.getX(), tondeuse.getY(), tondeuse.getOrientation());
        this.results.add(result);
    }

    public List<String> getResults() {
        return results;
    }
}
