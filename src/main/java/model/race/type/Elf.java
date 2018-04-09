package model.race.type;

import model.race.Race;
import model.race.RaceStartCharacteristics;

public class Elf extends Race {


    public Elf(String professionName) {
        super(RaceStartCharacteristics.ELF, professionName);
    }
}
