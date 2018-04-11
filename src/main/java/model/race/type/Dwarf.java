package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.RaceStartDatums;

@Getter
public class Dwarf implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Dwarf(String professionName) {
        this.professionName = professionName;
        this.raceName = RaceStartDatums.DWARF.getRaceName();
        this.charisma = RaceStartDatums.DWARF.getCharisma();
        this.stamina = RaceStartDatums.DWARF.getStamina();
        this.intellect = RaceStartDatums.DWARF.getIntellect();
        this.agility = RaceStartDatums.DWARF.getAgility();
        this.concentration = RaceStartDatums.DWARF.getConcentration();
    }
}
