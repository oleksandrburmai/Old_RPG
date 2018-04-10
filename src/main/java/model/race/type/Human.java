package model.race.type;

import model.race.Race;
import model.race.RaceStartDatums;

public class Human extends Race {


    public Human(String professionName) {
        super(RaceStartDatums.HUMAN, professionName);
    }
}
