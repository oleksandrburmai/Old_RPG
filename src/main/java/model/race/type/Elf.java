package model.race.type;

import model.race.Race;
import model.race.RaceStartDatums;

public class Elf extends Race {

    protected Elf(String professionName) {
        super(RaceStartDatums.ELF, professionName);
    }
}
