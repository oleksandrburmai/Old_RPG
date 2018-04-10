package model.race.type;

import model.race.Race;
import model.race.RaceStartDatums;

public class Human extends Race {

    protected Human(String professionName) {
        super(RaceStartDatums.HUMAN, professionName);
    }
}
