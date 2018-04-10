package model.race.type;

import model.race.Race;
import model.race.RaceStartDatums;

public class Dwarf extends Race {

    protected Dwarf(String professionName) {
        super(RaceStartDatums.DWARF, professionName);
    }
}
