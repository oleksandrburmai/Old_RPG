package model.race.type;

import model.race.Race;
import model.race.RaceStartCharacteristics;

public class Human extends Race {


    public Human(String professionName) {
        super(RaceStartCharacteristics.HUMAN, professionName);
    }
}
