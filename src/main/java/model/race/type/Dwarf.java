package model.race.type;

import model.race.Race;
import model.race.RaceStartCharacteristics;

public class Dwarf extends Race {

    public Dwarf(String professionName) {
        super(RaceStartCharacteristics.DWARF, professionName);
    }
}
