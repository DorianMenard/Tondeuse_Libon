package com.example.Tondeuse;

import org.springframework.stereotype.Service;

@Service
public class TondeuseService {

    public TondeuseResponse execTondeuses(TondeuseRequest request) {
        Pelouse pelouse = new Pelouse(request.getPelouseMaxX(), request.getPelouseMaxY());
        TondeuseResponse response = new TondeuseResponse();

        for(Tondeuse tondeuse : request.getTondeuses()) {
            tondeuse.setPelouse(pelouse);

            for (char action : tondeuse.getActions()) {
                if(action == 'A') {
                    tondeuse.moveForward();
                } else if (action == 'D') {
                    tondeuse.turnRight();
                } else if (action == 'G') {
                    tondeuse.turnLeft();
                }
            }

            response.addTondeuseResult(tondeuse);
        }

        return response;
    }
}
